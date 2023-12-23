package com.example.oritest.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Company {

    private String name;

    private String ticket;

}
