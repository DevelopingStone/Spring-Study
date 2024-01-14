package com.knight.woowacourse1;


import java.util.Arrays;

public class Coding0105 {

    public static void main(String[] args) {

        System.out.println(new solution0105().moneyWallet(50237));

    }
}

class solution0105 {
    public int[] moneyWallet(int money) {
        int[] wallet = new int[9];
        int[] kindMoney = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};


        for (int i = 0; i < kindMoney.length; i++) {
            wallet[i] = money / kindMoney[i];
            money %= kindMoney[i];

        }


        System.out.println(Arrays.toString(wallet));


        return wallet;
    }
}
