package com.example.oritest;

import com.example.oritest.scraper.Scraper;
import com.example.oritest.scraper.YahooFinanceScraper;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OriTestApplication {

    public static void main(String[] args) {
//        SpringApplication.run(OriTestApplication.class, args);
        Scraper scraper = new YahooFinanceScraper();
//        ScrapedResult result = scraper.scrap(Company.builder().ticket("COKE").build());
//        System.out.println(result);
        System.out.println(scraper.scrapCompanyByTicker("MMM"));

    }

}
