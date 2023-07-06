package com.knight.d0627;

import java.util.Arrays;

public class Pre0101 {
}

class Solution0101 {
    public int solution(int[] arr) {
        Arrays.sort(arr); // 배열을 오름차순으로 정렬

        for (int i = arr.length - 1; i >= 2; i--) {
            int a = arr[i];
            int b = arr[i - 1];
            int c = arr[i - 2];

            if (a < b + c) { // 삼각형 조건을 만족하는 경우
                return a + b + c; // 최댓값을 반환
            }
        }

        return 0; // 삼각형을 만들 수 없는 경우 0을 반환
    }
}