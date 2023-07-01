package com.knight.homework;

public class 회문구하기 {

  public static void main(String[] args) {

    main07 user = new main07();
    System.out.println(user.solution("abba"));
    System.out.println(user.solution("summuus"));
    System.out.println(user.solution("xabba"));
    System.out.println(user.solution("comwwtmoc"));
    System.out.println(user.solution("comwwmoc"));


  }

}

class main07 {

  public int solution(String str) {
    String a = "";
    int count = 0;
    for (String i : str.split("")) {
      if (!a.contains(i)) {
        a = a + i;
        count++;
      } else {
        count--;
      }
    }

    return count = Math.abs(count);
  }
}
