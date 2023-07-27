package com.knight.d0727;

public class Coding0101 {
    public static void main(String[] args) {

        System.out.println(new Solution0101().solution(3, new int[][]{{1, 3}, {2, 3}}));

    }
}

class Solution0101 {
    public int solution(int N, int[][] trust) {
        boolean[] give = new boolean[N + 1];
        int[] receive = new int[N + 1];

        for (int[] ints : trust) {
            give[ints[0]] = true;
            receive[ints[1]]++;
        }

        for (int i = 1; i < give.length; i++) {
            if (!give[i] && receive[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}