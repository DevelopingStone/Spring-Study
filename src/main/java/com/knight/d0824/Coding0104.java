package com.knight.d0824;

import java.util.Arrays;

public class Coding0104 {

    public static void main(String[] args) {
        System.out.println(new Solution0104().solution(20, new int[]{8, 15, 16, 18, 32, 16, 20, 15}));


    }


}


class Solution0104 {
    public int solution(int N, int[] branches) {
        int result = 0;

        Arrays.sort(branches);
        if (branches.length % 2 == 0) {
            for (int i = 0, j = branches.length - 1; i < j; i++, j--) {
                result += ((branches[i] + branches[j]) / N);
                if (branches[i] == 20) {
                    j++;

                } else if (branches[j] == 20) {
                    i--;
                }
            }




        } else {
            for (int i = 0, j = branches.length - 1; i < j; i++, j--) {
                result += (branches[i] + branches[j]) / N;
            }

            result += branches[branches.length / 2] / N;
        }


        return result;
    }
}