package com.knight.zerobase.thefirst;

public class OneAnd01 {

  public static void main(String[] args) {
    Solution01 user = new Solution01();
    System.out.println(user.solution(90));
  }

}

class Solution01 {

  public int solution(int n) {
    int count = 0;

    for (int i = 2; i <= n; i++) {
      for (int j = 2; j <= i; j++) {
        if (i % j == 0 && i != j) {
          break;
        } else if (i % j == 0 && i == j) {
          count++;
        }
      }
    }
    return count;
  }
}