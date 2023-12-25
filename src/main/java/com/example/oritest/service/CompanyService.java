package com.example.oritest.service;


import com.example.oritest.Entity.CompanyEntity;
import com.example.oritest.Entity.DividendEntity;
import com.example.oritest.Repository.CompanyRepository;
import com.example.oritest.Repository.DividendRepository;
import com.example.oritest.model.Company;
import com.example.oritest.model.ScrapedResult;
import com.example.oritest.scraper.Scraper;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@ToString
//@Transactional
public class CompanyService {

    private final Scraper yahooFinanceScraper;
    private final CompanyRepository companyRepository;
    private final DividendRepository dividendRepository;

    public Company save(String ticker) {
        boolean exists = this.companyRepository.existsByTicker(ticker);
        if (exists) {
            throw new RuntimeException("already exists ticker - > " + ticker);
        }
        return storeCompanyAndDividend(ticker);
    }

    private Company storeCompanyAndDividend(String ticker) {
        Company company = yahooFinanceScraper.scrapCompanyByTicker(ticker);
        ScrapedResult scrapedResult = yahooFinanceScraper.scrap(company);
        CompanyEntity companyEntity = companyRepository.save(CompanyEntity
                .builder()
                .name(company.getName())
                .ticker(company.getTicker())
                .build());

        List<DividendEntity> dividendEntities = scrapedResult.getDividend().stream()
                .map(e -> new DividendEntity(companyEntity.getId(), e))
                .toList();

        this.dividendRepository.saveAll(dividendEntities);

        return company;

    }

    public Page<CompanyEntity> getAllCompany(Pageable pageable) {
        return this.companyRepository.findAll(pageable);
    }

}
