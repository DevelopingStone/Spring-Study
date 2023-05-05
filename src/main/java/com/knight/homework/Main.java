package com.knight.homework;


import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
    int[] num = {7, 77, 17};
    String str = "abc1Addfggg4556b";
    System.out.println(user.solution(5278));
    System.out.println(Math.sqrt(144));


  }


}


class Solution {

  public Set<Integer> solution(int n) {
    Set<Integer> factors = new LinkedHashSet<>();

    // 2부터 n의 제곱근까지 모든 수에 대해 반복
    for (int i = 2; i <= Math.sqrt(n); i++) {
      // i가 n의 소인수인 경우
      while (n % i == 0) {
        // i를 소인수 목록에 추가하고, n을 i로 나눔
        factors.add(i);
        n /= i;
      }
    }

    // n이 소인수인 경우
    if (n > 1) {
      factors.add(n);
    }

    return factors;
  }
}