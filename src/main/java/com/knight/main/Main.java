package com.knight.main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(new Solution().solution(new int[]{1, 2, 3, 9, 10, 12}, 7));


    }
}


class Solution {
    public int solution(int[] scoville, int K) {
        int result = 0;
        Arrays.sort(scoville);
        while (scoville[0] <= K) {
            scoville[0] = scoville[0] + (scoville[1] * 2);
            scoville[1] = Integer.MAX_VALUE;

            result++;
            Arrays.sort(scoville);

            if (scoville[0] == Integer.MAX_VALUE) {
                break;
            }


        }


        return result;
    }
}