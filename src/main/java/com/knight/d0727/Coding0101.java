package com.knight.d0727;

import java.util.Arrays;

public class Coding0101 {
    public static void main(String[] args) {

        System.out.println(new Solution0101().solution(new int[]{9,4,2,3,7,5}));

    }
}

class Solution0101 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int result = numbers[0];
        for (int number : numbers) {
            if (number != result) {
                return result;
            }
            result++;
        }

        return result;

    }
}