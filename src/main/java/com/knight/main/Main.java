package com.knight.main;

public class Main {

    public static void main(String[] args) {

        System.out.println(new Solution().solution(2, 5));


    }
}


class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int num = 0;
        for (int i = 1; i <= n; i++) {

            answer[num++] = (long) i * x;


        }


        return answer;
    }
}
