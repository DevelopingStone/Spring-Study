package com.knight.d0627;

public class Pre0116 {
    public static void main(String[] args) {

        Solution0116 user = new Solution0116();
        System.out.println(user.solution(6,3));


    }
}


class Solution0116 {
    static long cnt;
    public void find(long pre, long n, long k, long sum) {
        if (sum == n) {
            cnt = (cnt + 1) % 1_000_000_007;
            return;
        } else if (sum > n) {
            return;
        }

        for (long i = 1; i <= k; i++) {
            if (i != pre) {
                find(i, n, k, sum + i);
            }
        }
    }


    public int solution(long n, long k) {
        find(0, n, k, 0);
        return (int)cnt;
    }
}