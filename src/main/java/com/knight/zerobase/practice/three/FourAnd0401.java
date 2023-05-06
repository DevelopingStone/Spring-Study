package com.knight.zerobase.practice.three;

import java.util.Arrays;

public class FourAnd0401 {

  public static void main(String[] args) {
    Solution0401 user = new Solution0401();

    System.out.println(user.solution(5, 3));

  }

}

class Solution0401 {

  private static final int MOD = 1000000007; // 나머지를 구할 값
  private int[][] memo; // 메모이제이션을 위한 배열

  public int solution(int n, int k) {
    memo = new int[n + 1][k + 1]; // memo 배열 초기화
    for (int i = 0; i <= n; i++) {
      Arrays.fill(memo[i], -1); // memo 배열을 -1로 초기화
    }
    int answer = 0; // 결과값을 저장할 변수
    answer = move(n, k, 0, 0); // 재귀함수 호출
    return answer; // 결과값 반환
  }

  private int move(int n, int k, int pos, int prev) {
    if (pos == n) { // 목적지에 도착한 경우
      return 1; // 경로의 수를 1로 반환
    }
    if (memo[pos][prev] != -1) { // 이전에 계산한 결과가 있을 경우, 저장된 값을 반환
      return memo[pos][prev];
    }
    int count = 0; // 가능한 경로의 수를 저장할 변수
    for (int i = 1; i <= k; i++) { // 가능한 모든 이동 거리에 대해 반복
      if (pos + i <= n && i != prev) { // 범위 내에 있고, 이전에 이동한 거리와 다른 경우에만 이동 가능
        count = (count + move(n, k, pos + i, i)) % MOD; // 이동 후 가능한 경로의 수를 재귀 호출을 통해 구한 후 count에 더함
      }
    }
    memo[pos][prev] = count; // 이전에 계산한 결과가 없으면 계산 결과를 memo 배열에 저장
    return count; // 가능한 경로의 수를 반환
  }
}