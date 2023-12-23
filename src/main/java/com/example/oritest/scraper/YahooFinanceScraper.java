package com.example.oritest.scraper;

import com.example.oritest.model.Company;
import com.example.oritest.model.Constants.Month;
import com.example.oritest.model.Dividend;
import com.example.oritest.model.ScrapedResult;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component
public class YahooFinanceScraper implements Scraper{

    private static final String STATISTICS_URL = "https://finance.yahoo.com/quote/%s/history?period1=%d&period2=%d&interval=1mo";
    private static final String SUMMARY_URL = "https://finance.yahoo.com/quote/%s?p=%s";

    private static final long START_TIME = 86400; //60 * 60 * 24

    @Override
    public ScrapedResult scrap(Company company) {
        ScrapedResult scrapedResult = new ScrapedResult();
        scrapedResult.setCompany(company);

        try {
            long now = System.currentTimeMillis() / 1000;
            String url = String.format(STATISTICS_URL, company.getTicket(), START_TIME, now);
            Connection connection = Jsoup.connect(url);
            Document document = connection.get();
            Elements parsingDivs = document.getElementsByAttributeValue("data-test", "historical-prices");
            Element tableEle = parsingDivs.get(0);
            Element tbody = tableEle.children().get(1);

            List<Dividend> dividends = new ArrayList<>();

            for (Element e : tbody.children()) {
                String txt = e.text();
                if (!txt.endsWith("Dividend")) {
                    continue;
                }
                String[] splits = txt.split(" ");

                int month = Month.monthToNumber(splits[0]);
                int day = Integer.parseInt(splits[1].replace(",", ""));
                int year = Integer.parseInt(splits[2]);
                String dividend = splits[3];

                if (month < 0) {
                    throw new RuntimeException("해당 값은 잘못된 값입니다 ->" + splits[0]);
                }

                Dividend build = Dividend.builder().date(LocalDateTime.of(year, month, day, 0, 0)).dividend(dividend)
                        .build();

                dividends.add(build);
            }

            scrapedResult.setDividendEntity(dividends);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return scrapedResult;
    }

    @Override
    public Company scrapCompanyByTicker(String ticker) {

        try {
            String url = String.format(SUMMARY_URL, ticker, ticker);
            Connection connection = Jsoup.connect(url);
            Document document = connection.get();
            Element titleEle = document.getElementsByTag("h1").get(0);
            String title = titleEle.text().split(" - ")[1].trim();

            return Company.builder()
                    .name(title)
                    .ticket(ticker)
                    .build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
