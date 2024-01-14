package com.knight.homework;

import java.util.Scanner;

public class 팰린드롬 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    int result = s.length();

    for (int i = 0; i < s.length(); i++) {
      String suffix = s.substring(i);
      if (isPalindrome(suffix)) {
        result = s.length() + i;
        break;
      }
    }

    System.out.println(result);
  }

  private static boolean isPalindrome(String str) {
    int len = str.length();
    for (int i = 0; i < len / 2; i++) {
      if (str.charAt(i) != str.charAt(len - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}

