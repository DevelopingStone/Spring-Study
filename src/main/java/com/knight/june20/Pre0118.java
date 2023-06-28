package com.knight.june20;

public class Pre0118 {
}


class Solution0118 {
    public int solution(int n) {
        int count = 0;

//        소수구하기 int a = (int) Math.sqrt(count);


        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }


        return count;
    }
}