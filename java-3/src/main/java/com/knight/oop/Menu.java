package com.knight.oop;

public class Menu {
    public void menu() {
        System.out.println("menu");
    }

    public static Menu from() {
        return new Menu();
    }
}