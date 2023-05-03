package com.knight.zerobase.practice.three;

public class OneAnd0105 {

  public static void main(String[] args) {
    Solution user = new Solution();
    user.solution(86, 100);
  }


}


class Solution {

  public int solution(int n, int price) {
    int sum = 0;
    if (n >= 1 && n <= 10) {
      sum = n * price;
    } else if (n <= 20) {
      sum = (n - 1) * price;
    } else if (n <= 30) {
      sum = (n - 2) * price;
    } else if (n <= 40) {
      sum = (n - 3) * price;
    } else if (n <= 50) {
      sum = (n - 4) * price;
    } else if (n <= 60) {
      sum = (n - 5) * price;
    } else if (n <= 70) {
      sum = (n - 6) * price;
    } else if (n <= 80) {
      sum = (n - 7) * price;
    } else if (n <= 90) {
      sum = (n - 8) * price;
    } else if (n <= 100) {
      sum = (n - 8) * price;
    }

    System.out.println(sum);

    return sum;
  }
}