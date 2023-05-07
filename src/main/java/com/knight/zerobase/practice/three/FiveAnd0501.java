package com.knight.zerobase.practice.three;

public class FiveAnd0501 {

  public static void main(String[] args) {

    Solution0501 user = new Solution0501();
    System.out.println(user.solution(15));
  }
}

class Solution0501 {

  public int solution(int n) {

    int count = 0;
    for (int i = 0; i < n / 2; i++) {
      int sum = 0;
      for (int j = i + 1; j <= n; j++) {
        sum += j;
        if (sum == n) {
          count++;
          break;
        }
        if (sum > n) {
          break;
        }

      }
    }

    return count + 1;
  }
}