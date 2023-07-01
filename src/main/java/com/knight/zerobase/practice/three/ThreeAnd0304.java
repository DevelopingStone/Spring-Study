package com.knight.zerobase.practice.three;

public class ThreeAnd0304 {

  public static void main(String[] args) {
    Solution0304 user = new Solution0304();
    System.out.println(user.solution(61234));
  }

}


class Solution0304 {

  public int solution(int A) {
    int[] coins = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
    int count = 0;
    for (int coin : coins) {
      System.out.println("A = " + A);
      count += A / coin;
      A %= coin;

    }
    return count;
  }
}