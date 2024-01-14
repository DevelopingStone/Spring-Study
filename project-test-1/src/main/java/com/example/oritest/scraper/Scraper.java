package com.example.oritest.scraper;

import com.example.oritest.model.Company;
import com.example.oritest.model.ScrapedResult;

public interface Scraper {

    public ScrapedResult scrap(Company company);

    Company scrapCompanyByTicker(String ticker);

}
