package com.knight.zerobase.practice.two;

public class TwoAnd0203 {

  public static void main(String[] args) {
    Solution0203 user = new Solution0203();
    System.out.println(user.solution(99));
  }


}

class Solution0203 {

  public int solution(int n) {
    return (int) Math.cbrt(n)*(int) Math.cbrt(n)*(int) Math.cbrt(n);
//    n값의 세제곱근을 구한뒤 (int)로 변환하면 양의정수 중 가장 큰 수가 나온다.
//    그걸다시 3번 반복하면 세제곱 수를 구할수 있다.

  }
}