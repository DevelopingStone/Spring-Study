package com.knight.homework;

public class Main {

  public static void main(String[] args) {

    Solution user = new Solution();
    System.out.println(user.solution(8, 12));


  }

}


class Solution {

  public long solution(int a, int b) {
    int gcd = 0;
    for (int i = 1; i <= a && i <= b; i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
        System.out.println(gcd);
      }
    }

    return 0;
  }
}











