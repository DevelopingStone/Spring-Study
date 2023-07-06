package com.knight.d0704;

import java.util.Arrays;

public class Pre0111 {
    public static void main(String[] args) {
        Solution0111 user = new Solution0111();
//        System.out.println(user.solution());
    }
}

class Solution0111 {

    public int solution(int[] arr, int n) {
        int result = -1;
        Arrays.sort(arr);
        for (int num : arr) {
            if (num >= n) {
                return num;
            }
        }
        return result;
    }
}
