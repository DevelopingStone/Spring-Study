package com.knight.d0831;

public class Coding0103 {
    public static void main(String[] args) {

        System.out.println(new Solution0103().solution(6, new int[]{5, 10, 5, 7, 5, 9}));



    }
}








class Solution0103 {
    public int solution(int N, int[] rewards) {
        int a = 0;
        int b = 0;

        for (int i = 0, j = 1; i < rewards.length; i += 2, j += 2) {
            a += rewards[i];
            b += rewards[j];
        }

        if (a > b) {
            return a;
        } else {
            return b;
        }

    }
}