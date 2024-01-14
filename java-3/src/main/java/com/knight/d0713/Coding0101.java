package com.knight.d0713;

public class Coding0101 {
    public static void main(String[] args) {

        System.out.println(new Solution0101().solution(77));
    }
}

class Solution0101 {
    public int solution(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    break;
                } else if (i == j) {
                    count++;
                }
            }
        }
        return count;
    }
}