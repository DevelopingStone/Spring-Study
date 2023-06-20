package com.knight.june20;

public class Pre0103 {
}


class Solution0103 {
    public int solution(int[] A) {
        int profit = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] - A[i] > profit) {
                    profit = A[j] - A[i];
                }
            }
        }
        if (profit < 0) {
            return 0;
        }
        return profit;
    }
}