package com.example.oritest.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Builder
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Dividend {
    private LocalDateTime date;

    private String dividend;

}
