package com.knight.d0704;


import java.util.Arrays;

public class Pre0113 {
    public static void main(String[] args) {
        Solution0113 user = new Solution0113();
//        System.out.println(user.solution("2*3/6*3+15"));

    }


}


class Solution0113 {
    public int solution(int[] A) {
        int answer = 0;

        Arrays.sort(A);

        for (int i = A.length / 2 - 1, j = -2; i >= 0; i--, j -= 2) {
            answer += A[i] * j;
        }

        for (int i = A.length / 2, j = 1; i < A.length; i++, j += 2) {
            answer += A[i] * j;
        }

        return answer;
    }
}






