package com.example.oritest.service;

import com.example.oritest.Entity.CompanyEntity;
import com.example.oritest.Entity.DividendEntity;
import com.example.oritest.Repository.CompanyRepository;
import com.example.oritest.Repository.DividendRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@ToString
public class FinanceService {

    CompanyRepository companyRepository;

    DividendRepository dividendRepository;

    public long searchCompanyId(String companyName) {
        CompanyEntity companyEntity = companyRepository.findByName(companyName);
        if (companyEntity != null) {
            return companyEntity.getId();
        }
        throw new RuntimeException("저장되지 않는 회사명입니다. -> " + companyName);
    }

    public List<DividendEntity> searchCompanyDividend(long companyId) {
        return dividendRepository.findAllByCompanyId(companyId);
    }

}
