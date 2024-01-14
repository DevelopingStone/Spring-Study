package com.knight.zerobase.practice.three;

public class OneAnd0103 {

  public static void main(String[] args) {
    Solution0103 user = new Solution0103();
    System.out.println(user.solution(3));
  }

}


class Solution0103 {
  public  int solution(int n) {
    if (n == 0) {
      return 1;
    }

    int count = 10; // 자릿수가 1인 경우

    int uniqueDigits = 9;
    for (int i = 2; i < n && i < 10; i++) {
      uniqueDigits *= (10 - i);
      count += uniqueDigits;
    }

    return count-1;
  }

}
