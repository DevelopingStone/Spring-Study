package com.example.oritest.model;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.ToString;



@Builder
@ToString
public class Dividend {
    private LocalDateTime date;

    private String dividend;

}
