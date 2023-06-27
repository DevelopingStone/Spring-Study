package com.knight.june27;

import java.util.Arrays;

public class Pre0102 {
}


class Solution0102 {
    public int solution(int[] arr) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }

        return sum / (arr.length - 2);

    }
}