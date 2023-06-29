package com.knight.june27;

public class Pre0118 {
}


class Solution0118 {
    public int solution(String S1, String S2) {
        S1 = S1 + S1;
        if (S1.contains(S2)) {
            return 1;
        } else {
            return 0;
        }
    }
}