package com.knight.zerobase.thefirst;

public class OneAnd03 {

  public static void main(String[] args) {
    Solution03 user = new Solution03();
    System.out.println(user.solution(4));
  }

}


class Solution03 {

  public int solution(int n) {
    int[] dp = new int[n+1];

    dp[0] = 1;
    dp[1] = 2;

    for (int i = 2; i < n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n - 1];
  }

}