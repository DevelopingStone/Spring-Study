package com.example.oritest.service;


import com.example.oritest.model.Company;
import com.example.oritest.scraper.Scraper;
import com.example.oritest.scraper.YahooFinanceScraper;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@ToString
//@Transactional
public class CompanyService {

    @Autowired
    private final Scraper yahooFinanceScraper;

    public Company save(String ticker) {
        return null;
    }

    private Company storeCompanyAndDividend(String ticker) {

        //      티커 전달받음
        //      티커를 통해 회사명 저장
        //      회사가 존재하는 경우 배당금 저장
        //      존재하지 않는경우 에러
        return yahooFinanceScraper.scrapCompanyByTicker(ticker);
    }

}
