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

        int[][] result = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                int value = arr1[i][j] + arr2[i][j];

                if (signs[i][j]) {
                    result[i][j] = value;
                } else {
                    result[i][j] = -value;
                }

            }
        }

        for (int[] a : result) {
            System.out.println(Arrays.toString(a));
        }


        return result;
    }

}


