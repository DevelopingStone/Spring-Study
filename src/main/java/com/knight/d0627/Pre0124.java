package com.knight.d0627;

public class Pre0124 {
}


class Solution0124 {
    public int solution(int n) {
        int result = 1;
        while (n > 0) {
            result = (result * 2) % 1000000007;
            n--;
        }
        return result - 1;
    }
}