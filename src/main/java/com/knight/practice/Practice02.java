package com.knight.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice02 {

  public static void main(String[] args) {

    Main02 user = new Main02();
//    System.out.println(user.solution("ab","adbak"));
    user.solution("ab", "adbak");


  }

}

class Main02 {

  public boolean solution(String str1, String str2) {
    List<String> list = new ArrayList<>(Arrays.asList(str2));
    System.out.println(list);

    for (String i : list) {
      for (int j = 0; j*str1.length() < i.length(); j+=str1.length()) {
        System.out.println(i.substring(j,j+str1.length()));

      }

    }

    return true;

  }

}
