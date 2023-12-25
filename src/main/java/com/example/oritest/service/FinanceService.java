package com.example.oritest.service;

import com.example.oritest.Entity.CompanyEntity;
import com.example.oritest.Entity.DividendEntity;
import com.example.oritest.Repository.CompanyRepository;
import com.example.oritest.Repository.DividendRepository;
import com.example.oritest.model.Company;
import com.example.oritest.model.Dividend;
import com.example.oritest.model.ScrapedResult;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@ToString
public class FinanceService {

    private final CompanyRepository companyRepository;

    private final DividendRepository dividendRepository;

    public ScrapedResult searchCompanyId(String companyName) {
        CompanyEntity companyEntity = companyRepository.findByName(companyName)
                .orElseThrow(() -> new RuntimeException("저장되지 않는 회사명입니다. -> " + companyName));

        List<DividendEntity> dividendEntities = dividendRepository.findAllByCompanyId(companyEntity.getId());

        List<Dividend> dividends = dividendEntities.stream()
                .map(e -> Dividend.builder()
                        .date(e.getDate())
                        .dividend(e.getDividend())
                        .build())
                .toList();

        return new ScrapedResult(Company.builder()
                .ticker(companyEntity.getTicker())
                .name(companyEntity.getName())
                .build(), dividends);

    }


}
