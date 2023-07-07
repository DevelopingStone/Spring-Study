package com.knight.d0704;

public class Pre0121 {

    public static void main(String[] args) {

        Solution0121 user = new Solution0121();

        System.out.println(user.solution(15));
    }
}

class Solution0121 {

    public int solution(int n) {
        int count = 0, sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = i;

            for (int j = i + 1; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    count++;
                } else if (sum > n) {
                    break;
                }
            }

        }

        return count + 1;
    }
}