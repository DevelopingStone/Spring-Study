package com.knight.main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Boolean[][] arr = new Boolean[][]{{}};

        System.out.println(new Solution().solution(new int[][]{{5, 7, 1}, {2, 3, 5}}, new int[][]{{5, 1, 6}, {7, 5, 6}}, new Boolean[][]{{true, true, false}, {false, true, false}}));
    }
}


class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2, Boolean[][] signs) {
        int rows = arr1.length;   // 행의 개수를 가져옴
        int cols = arr1[0].length; // 열의 개수를 가져옴
        int[][] answer = new int[rows][cols]; // 결과를 담을 배열 생성

        for (int i = 0; i < rows; i++) { // 행을 순회
            for (int j = 0; j < cols; j++) { // 열을 순회
                // signs 배열의 값에 따라 덧셈 또는 뺄셈 수행하여 결과 배열에 저장
                answer[i][j] = signs[i][j] ? arr1[i][j] + arr2[i][j] : -(arr1[i][j] + arr2[i][j]);
            }
        }

        for (int[] a : answer) {
            System.out.println(Arrays.toString(a));
        }


        return answer; // 결과 배열 반환
    }
}


