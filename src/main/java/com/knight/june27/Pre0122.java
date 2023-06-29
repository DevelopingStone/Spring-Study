package com.knight.june27;

public class Pre0122 {

    public static void main(String[] args) {

    }
}


class Solution0122 {
    public int solution(int[] nums, int n) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                return i;
            }

        }
        return -1;
    }
}