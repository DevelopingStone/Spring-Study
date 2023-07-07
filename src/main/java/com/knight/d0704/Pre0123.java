package com.knight.d0704;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Pre0123 {
    public static void main(String[] args) {
        int[][] A = {{1},{2,5},{7,10,1},{9,4,4,5}};
        Solution0123 user = new Solution0123();
        System.out.println(user.solution(A));

    }
}

class Solution0123 {
    static int minWaitTime = Integer.MAX_VALUE;
    public void findWay(int[][] A, int idx, int length, int sumWaitTime) {
        if (A.length == length) {
            minWaitTime = Math.min(minWaitTime, sumWaitTime);
            return;
        }

        for (int i = idx; i <= idx+1; i++) {
            findWay(A, i, length+1, sumWaitTime+A[length][idx]);
        }
    }// dfs로 해결
    public int solution(int[][] A) {
        findWay(A, 0, 0, 0);
        return minWaitTime;
    }
}