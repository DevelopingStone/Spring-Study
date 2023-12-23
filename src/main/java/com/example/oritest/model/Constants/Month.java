package com.example.oritest.model.Constants;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Month {

    JAN("Jan", 1),
    FEB("Feb", 2),
    MAR("Mar", 3),
    APR("Apr", 4),
    MAY("May", 5),
    JUN("Jun", 6),
    JUL("Jul", 7),
    AUG("Aug", 8),
    SEP("Sep", 9),
    OCT("Oct", 10),
    NOV("Nov", 11),
    DEC("Dec", 12);

    private final String month;
    private final int number;

    public static int monthToNumber(String month) {
        for (Month number : Month.values()) {
            if (number.month.equals(month)) {
                return number.number;
            }
        }
        return -1;
    }


}
