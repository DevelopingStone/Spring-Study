package com.knight.d0704;

public class Pre0110 {
    public static void main(String[] args) {
        Solution0110 user = new Solution0110();
//        System.out.println(user.solution(-340));

    }

}

class Solution0110 {
    public int solution(int[] arr, int n) {
        int result = -1;
        for (int num : arr) {
            if (num <= n && num >= result) {
                result = num;
            }
        }
        return result;
    }
}