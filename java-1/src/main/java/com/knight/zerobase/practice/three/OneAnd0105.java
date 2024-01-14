package com.knight.zerobase.practice.three;


public class OneAnd0105 {

  public static void main(String[] args) {
    Solution0105 user = new Solution0105();
//    user.solution(31, 100);
  }


}


class Solution0105 {

  public int solution(int n, int price) {
    int sum = 0;
    if (n >= 1 && n <= 10) {
      sum = n * price;
    } else if (n <= 100) {
      int discount = n / 10;
      sum = (n - discount) * price;
    }

    System.out.println(sum);

    return sum;
  }
}