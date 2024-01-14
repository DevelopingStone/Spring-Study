package com.knight.d0620;

public class Pre0117 {
    public static void main(String[] args) {
        String[] arr = {"10110", "1010", "11110"};
        Solution0117 user = new Solution0117();
        System.out.println(user.solution(arr));
    }
}


class Solution0117 {
    public int solution(String[] arr) {
        /*
        int answer = 0;

        int[] decimal = new int[arr.length];
        for (int i = 0; i < decimal.length; i++) {
            decimal[i] = Integer.parseInt(arr[i], 2);
        }
        System.out.println(Arrays.toString(decimal));

        /*
        a & b
        a | B
        A ^ B : XOR
        ~ a : NOT
        A << B : 왼쪽시프트

        for (int j : decimal) {
            answer = answer ^ j;
        }

        return answer;
        */
        int[] num = new int[arr.length];
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i], 2);
        }

        for (int i = 0; i < num.length; i++) {
            result ^= num[i];
        }

        /*
        a & b
        a | B
        A ^ B : XOR
        ~ a : NOT
        A << B : 왼쪽시프트
        */


        return result;
    }
}