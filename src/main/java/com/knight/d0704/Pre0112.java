package com.knight.d0704;

import java.util.Arrays;

public class Pre0112 {
    public static void main(String[] args) {
        Solution0112 user = new Solution0112();
        int[] arr = {50,60, 25, 90, 30};
        System.out.println(user.solution(arr, 100));
    }
}















class Solution0112 {
    public int solution(int[] people, int limit) {

        Arrays.sort(people);
        int count = 0;

        for (int i = 0, j = people.length - 1; i < j; j--) {
            if (people[i] + people[j] <= 100) {
                count++;
                i++;
            }
        }

        return people.length - count;
    }
}