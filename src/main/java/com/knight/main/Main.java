package com.knight.main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(new Solution().solution(10, 2));

    }
}


class Solution {
    public int[] solution(int brown, int yellow) {
        int result[] = new int[2];


        if (brown > yellow) {
            result[0] = yellow + 2;
            result[1] = (brown + yellow) / result[0];
        } else {

        }

        System.out.println(Arrays.toString(result));


        return result;
    }
}


