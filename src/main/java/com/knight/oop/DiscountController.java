package com.knight.oop;

public class DiscountController {

    private final Date date;
    private final Menu menu;

    public DiscountController(Date date, Menu menu) {
        this.date = date;
        this.menu = menu;
    }

    public static Discount from(Date date, Menu menu) {
        new DiscountController(date, menu);
        return new Discount();
    }
}
