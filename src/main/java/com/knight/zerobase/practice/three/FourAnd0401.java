package com.knight.zerobase.practice.three;

import java.util.Arrays;

public class FourAnd0401 {

  public static void main(String[] args) {
    Solution0401 user = new Solution0401();
    System.out.println(user.solution(5, 3));
  }

}

class Solution0401 {

  // 나머지를 구할 값
  private static final int MOD = 1000000007;

  public int solution(int n, int k) {
    int answer = 0;

    // dp 테이블 초기화
    // 이동 거리가 1일 때부터 k일 때까지 각각 1로 초기화
    int[][] dp = new int[n + 1][k + 1];
    for (int i = 1; i <= k; i++) {
      dp[i][i] = 1;
    }

    for (int i = 0; i < dp.length; i++) {
      System.out.println(Arrays.toString(dp[i]));
    }

    // DP를 이용하여 경로 수 계산
    for (int i = 1; i <= n; i++) { // 현재 위치
      for (int j = 1; j <= k; j++) { // 현재 위치까지 오는 데 이동한 거리
        for (int l = 1; l <= k; l++) { // 이전 위치까지 오는 데 이동한 거리
          if (i >= j + l && l != j) { // 범위 내에 있으며, 이전 위치와 현재 위치까지 오는 데 이동한 거리가 서로 다른 경우
            dp[i][j] = (dp[i][j] + dp[i - j][l]) % MOD; // dp[i][j]에 dp[i-j][l]을 더한 값을 저장
//            System.out.print(" i = " + i);
//            System.out.print(" j = " + j);
//            System.out.print(" l = " + l);
//            System.out.println();
          }
        }
      }
    }

    for (int i = 0; i < dp.length; i++) {
      System.out.println(Arrays.toString(dp[i]));
    }

    // 도착지에 도달하는 경로 수 계산
    for (int i = 1; i <= k; i++) {
      answer += dp[n][i];
    }

    return answer % MOD; // 결과 값 반환
  }
}
