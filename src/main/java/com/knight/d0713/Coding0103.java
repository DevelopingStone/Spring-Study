package com.knight.d0713;

public class Coding0103 {
    public static void main(String[] args) {
        System.out.println(new Solution0103().solution(8));
    }
}


class Solution0103 {
    public int solution(int N) {
        int[] beer = new int[N];

        beer[0] = 1;
        beer[1] = 2;

        for (int i = 2; i < beer.length; i++) {
            beer[i] = beer[i - 1] + beer[i - 2];
        }
        return beer[N - 1];
    }

}