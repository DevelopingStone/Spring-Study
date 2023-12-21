package com.example.oritest;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PutMapping;

@SpringBootApplication
public class OriTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(OriTestApplication.class, args);

//        try {
//            Connection connection = Jsoup.connect(
//                    "https://finance.yahoo.com/quote/COKE/history?period1=99100800&period2=1703030400&interval=1mo&filter=history&frequency=1mo&includeAdjustedClose=true");
//            Document document = connection.get();
//
//            Elements elements = document.getElementsByAttributeValue("data-test", "historical-prices");
//            Element element = elements.get(0);
//
//            Element tbody = element.children().get(1);
//            for (Element e : tbody.children()) {
//                String txt = e.text();
//                if (!txt.endsWith("Dividend")) {
//                    continue;
//                }
//                String[] splits = txt.split(" ");
//                String month = splits[0];
//                String day = splits[1].replace(",", "");
//                String year = splits[2];
//                String dividend = splits[3];
//
//                System.out.printf("%s-%s-%s : %s", year, month, day, dividend);
//                System.out.println();
//
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


    }

}
