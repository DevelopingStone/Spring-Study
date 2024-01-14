package com.knight.homework;

public class 부분문자열 {

  public static void main(String[] args) {

    Solution1 user01 = new Solution1();

    System.out.println(user01.solution("12345678909876", "1500"));

  }
}

class Solution1 {

  public int solution(String t, String p) {
    int count = 0;
    int aLen = t.length();
    int bLen = p.length();
    for (int i = 0; i <= aLen - bLen; i++) {

      int number1 = Integer.parseInt(t.substring(i, i + bLen));
      System.out.println("number1 = " + number1);
      int number2 = Integer.parseInt(p);
      System.out.println("number2 = " + number2);

      if (number1 <= number2) {
        count++;
      }

    }

    return count;

  }
}




