package com.knight.homework;

import java.util.ArrayList;
import java.util.List;

public class 문자반복출력하기 {

  public static void main(String[] args) {

    String a = "abcde";
    String b = "a";
    String c = "";
    String answer = a.replace(b,"123");
    System.out.println(answer);

  }

}

class main13 {

  public String solution(String my_string, String letter) {
    List<String> list = new ArrayList<>();
    String st = "";
    for (String str : my_string.split("")) {
      list.add(str);
    }

    while (list.contains(letter)) {
      list.remove(letter);
    }
    System.out.println(list);
    for (int i = 0; i < list.size(); i++) {
      st += list.get(i);

    }

    return st;
  }

}
