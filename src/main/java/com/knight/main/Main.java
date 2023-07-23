package com.knight.main;

public class Main {

    public static void main(String[] args) {

        System.out.println(new Solution().solution(new int[]{1, 5, 7, 10, 5, 3}));


    }
}


class Solution {
    public int[] solution(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                result[i]++;


                if (prices[i] > prices[j]) {
                    break;
                }

            }
        }
        return result;
    }
}