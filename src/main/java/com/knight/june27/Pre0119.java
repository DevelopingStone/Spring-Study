package com.knight.june27;

public class Pre0119 {

    public static void main(String[] args) {
        Solution0119 user = new Solution0119();


    }
}

class Solution0119 {
    public int solution(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
        }

        return count;
    }
}