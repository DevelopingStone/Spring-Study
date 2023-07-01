package com.knight.zerobase.practice.two;

public class FiveAnd0504 {

  public static void main(String[] args) {
    Solution0504 user = new Solution0504();
    System.out.println(user.solution(1000000));

  }
}

class Solution0504 {

  public int solution(int n) {
    int result = 1;
    while (n > 0) {
      result *= 2;
      result %= 1000000007;
      n--;
    }

    return result - 1;
  }
}
