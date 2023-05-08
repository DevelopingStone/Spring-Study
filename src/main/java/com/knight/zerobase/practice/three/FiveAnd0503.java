package com.knight.zerobase.practice.three;

import java.util.Arrays;

public class FiveAnd0503 {

  public static void main(String[] args) {

    Solution0503 user = new Solution0503();
    int[][] arr = {{1}, {2, 5}, {7, 10, 1}, {9, 4, 4, 5}};
    System.out.println(user.solution(arr));

  }
}

class Solution0503 {

  public int solution(int[][] A) {
    // 입력 배열 A의 크기를 구합니다.
    int n = A.length;
    // 다이나믹 프로그래밍을 위한 2차원 배열 dp를 생성합니다.
    int[][] dp = new int[n][n];
    // 첫 번째 행의 첫 번째 칸에는 입력 배열 A의 첫 번째 값을 저장합니다.
    dp[0][0] = A[0][0];
    for(int i =0; i<dp.length;i++){
      System.out.println(Arrays.toString(dp[i]));
    }
    // 두 번째 행부터 마지막 행까지 반복합니다.
    for (int i = 1; i < n; i++) {
      // 첫 번째 열의 경우, 왼쪽에서만 올 수 있으므로 이전 행의 첫 번째 값을 더하여 계산합니다.
      dp[i][0] = dp[i - 1][0] + A[i][0];
      // 마지막 열의 경우, 오른쪽에서만 올 수 있으므로 이전 행의 마지막 값을 더하여 계산합니다.
      dp[i][i] = dp[i - 1][i - 1] + A[i][i];
      // 그 외의 경우, 왼쪽 위에서 오는 경우와 오른쪽 위에서 오는 경우를 모두 고려합니다.
      for (int j = 1; j < i; j++) {
        dp[i][j] = A[i][j] + Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
      }
    }

    for(int i =0; i<dp.length;i++){
      System.out.println(Arrays.toString(dp[i]));
    }

    // 마지막 행에서 가장 작은 값을 찾아서 반환합니다.
    int minWaitTime = Integer.MAX_VALUE;
    for (int j = 0; j < n; j++) {
      if (dp[n - 1][j] < minWaitTime) {
        minWaitTime = dp[n - 1][j];
      }
    }

    return minWaitTime;
  }
}


/*
3-4,3-4 pre 리팩토링
객체지향 개념 스터디 준비
선형,비선형 부족한 개념 인강듣기
공부 8시간이상
운동 1시간
 */



