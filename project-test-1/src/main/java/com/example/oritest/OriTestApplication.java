package com.example.oritest;

import java.util.Random;

//@SpringBootApplication
public class OriTestApplication {

    public static void main(String[] args) {
//        SpringApplication.run(OriTestApplication.class, args);

        Random rand = new Random();
        StringBuilder authKey = new StringBuilder();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            String ranAuthKey = Integer.toBinaryString(rand.nextInt(3));
            String ranNum = Integer.toString(rand.nextInt(10));
            authKey.append(ranAuthKey);
            num.append(ranNum);
        }
        System.out.println(authKey);
        System.out.println(num);
    }

}
