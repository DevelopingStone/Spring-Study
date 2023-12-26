package com.example.oritest.service;


import com.example.oritest.Entity.CompanyEntity;
import com.example.oritest.Entity.DividendEntity;
import com.example.oritest.Repository.CompanyRepository;
import com.example.oritest.Repository.DividendRepository;
import com.example.oritest.model.Company;
import com.example.oritest.model.ScrapedResult;
import com.example.oritest.scraper.Scraper;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.Trie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CompanyService {

    private final Trie trie;

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
        CompanyEntity companyEntity = companyRepository.save(
                CompanyEntity.builder().name(company.getName()).ticker(company.getTicker()).build());

        List<DividendEntity> dividendEntities = scrapedResult.getDividend().stream()
                .map(e -> new DividendEntity(companyEntity.getId(), e)).toList();

        this.dividendRepository.saveAll(dividendEntities);

        return company;

    }

    public Page<CompanyEntity> getAllCompany(Pageable pageable) {
        return this.companyRepository.findAll(pageable);
    }

    public void addAutocompleteKeyword(String keyword) {
        this.trie.put(keyword, null);
    }

    public List<String> autocomplete(String keyword) {
        return (List<String>) this.trie.prefixMap(keyword).keySet()
                .stream().collect(Collectors.toList());
    }

    public void deleteAutocompleteKeyword(String keyword) {
        this.trie.remove(keyword);
    }

}
