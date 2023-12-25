package com.example.oritest.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@AllArgsConstructor
@Setter
public class ScrapedResult {
    private Company company;

    private List<Dividend> dividend;

    public ScrapedResult() {
        dividend = new ArrayList<>();
    }

}
