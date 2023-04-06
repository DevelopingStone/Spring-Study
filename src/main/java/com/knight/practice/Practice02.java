package com.knight.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice02 {

  public static void main(String[] args) {

    Main02 user = new Main02();
//    System.out.println(user.solution("ab","adbak"));
    System.out.println(user.solution("ab", "adbak"));


  }
}

class Main02 {

  public boolean solution(String str1, String str2) {
    List<String> list = new ArrayList<>(Arrays.asList(str2));
    boolean containsAB = false;
    boolean containsBA = false;

    for (String str : list) {
      for (int j = 0; j * str1.length() < str.length(); j += str1.length()) {
        String substring = str.substring(j, j + str1.length());
        if (substring.equals(str1)) {
          containsAB = true;
        } else if (substring.equals(new StringBuilder(str1).reverse().toString())) {
          containsBA = true;
        }
        if (containsAB && containsBA) {
          return true;
        }
      }
    }

    return false;
  }
}
