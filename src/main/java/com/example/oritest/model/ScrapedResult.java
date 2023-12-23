package com.example.oritest.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ScrapedResult {
    private Company company;

    private List<Dividend> dividendEntity;

    public ScrapedResult() {
        this.dividendEntity = new ArrayList<>();
    }
}
