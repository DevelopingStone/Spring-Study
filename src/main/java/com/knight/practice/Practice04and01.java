package com.knight.practice;

import java.util.HashSet;

public class Practice04and01 {

  public static void main(String[] args) {
    System.out.println(solution(19));
    System.out.println(solution(2));
    System.out.println(solution(61));


  }

  public static boolean solution(int a) {
    HashSet<Integer> set = new HashSet<>();
    int sum = 0;
    int result = 0;

    while (set.add(a)) {
      sum = 0;
      while (a > 0) {
        result = a % 10;
        sum += result * result;
        a = a / 10;

      }

      if (sum == 1) {

        return true;
      } else {

        a = sum;
      }
    }
    return false;
  }

}
