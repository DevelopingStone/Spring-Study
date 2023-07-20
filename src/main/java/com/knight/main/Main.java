package com.knight.main;

public class Main {

    public static void main(String[] args) {
        int[][] puddles = {{2, 2}};

        new Solution().solution(6, 7, puddles);


    }
}


class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] road = new int[m + 1][n + 1];


        for (int i = 0; i < puddles.length; i++) {
            road[puddles[i][0]][puddles[i][1]] = -1;
        }

        road[1][1] = 1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (road[i][j] == -1) {
                    continue;
                }
                if (road[i - 1][j] > 0) {
                    road[i][j] += road[i - 1][j] % 1_000_000_007;

                }
                if (road[i][j - 1] > 0) {
                    road[i][j] += road[i][j - 1] % 1_000_000_007;
                }

            }
        }


        return road[m][n] % 1_000_000_007;
    }
}