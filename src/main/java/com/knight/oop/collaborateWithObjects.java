package com.knight.oop;

public class collaborateWithObjects {

}

class barista1 {
    Barista2 barista2;

    public void makeCoffee() {
        System.out.println("커피를 1분당 1개를 만들수 있음");
    }

    public void makingCoffeeTogether() {
        barista2.makeCoffee();
    }
}

class Barista2 {
    public void makeCoffee() {
        System.out.println("커피를 1분당 3개를 만들수 있음");
    }
}

class CoffeeShop {
    public static void main(String[] args) {

    }
}

