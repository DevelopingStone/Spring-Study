package com.knight.homework;

public class 문자반복출력 {

  public static void main(String[] args) {
    Main9 user = new Main9();
    System.out.println(user.solution("hello,", 3));

    String a = "abc";

    String[] a1 = new String[a.length() * 3];
    for (int i = 0; i < a1.length; i++) {
      a1[i] = a.substring(i, i + 1);

    }
    for(String i : a1){
      System.out.println(i);
    }


  }
}

class Main9 {

  public String solution(String my_string, int n) {

    String answer = "";
    return answer;
  }

}
