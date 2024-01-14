package com.knight.d0704;

import java.util.Arrays;

public class Pre0124 {

    public static void main(String[] args) {
        int[] A = {2, 3, 4, 5, 6};
        Solution0124 user = new Solution0124();
        System.out.println(user.solution(A, 15));
    }

}


class Solution0124 {
    public int solution(int[] A, int K) {

        int answer = 0, sum = 0;
        Arrays.sort(A);

        for (int num : A) {
            if (sum + num <= K) {
                sum += num;
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}