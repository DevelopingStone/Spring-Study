package com.knight.main;

public class Main {

    public static void main(String[] args) {

        System.out.println(new Solution().solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));


    }
}


class Solution {
    public static boolean check[];
    public static int ans = 0;

    public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];

        dfs(k, dungeons, 0);

        return ans;
    }

    public static void dfs(int tired, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!check[i] && dungeons[i][0] <= tired) {
                check[i] = true;
                dfs(tired - dungeons[i][1], dungeons, cnt + 1);
                check[i] = false;
            }
        }
        ans = Math.max(ans, cnt);
    }
}