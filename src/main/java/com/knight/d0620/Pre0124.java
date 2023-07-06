package com.knight.d0620;

public class Pre0124 {
}


class Solution0124 {
    public int solution(int n) {
        double s = Math.sqrt(n);
        if (s == (int) s) {
            return (int) s;
        } else {
            return 0;
        }
    }
}