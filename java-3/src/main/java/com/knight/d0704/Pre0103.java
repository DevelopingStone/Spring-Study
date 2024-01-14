package com.knight.d0704;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pre0103 {
    public static void main(String[] args) {
        Solution0103 user = new Solution0103();
//        System.out.println(user.solution(100000));
    }
}


class Solution0103 {
    public int solution(int n) {
        long answer = 9, MOD = 1_000_000_007, cnt = (n + 1) / 2;


        for (long i = 1; i < cnt; i++) {
            if (n == 1) {
                return 10;
            }
            answer *= 10;
            answer %= MOD;
            // 9 * 10 * 10 * 10 ....
        }

        return (int) answer;
    }
}