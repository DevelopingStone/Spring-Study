package com.knight.d1102;

import java.util.Arrays;

public class Coding0101 {
    public static void main(String[] args) {

    }
}


class Solution0101 {

    public int solution(int[] nums) {
        Arrays.sort(nums);

        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

}