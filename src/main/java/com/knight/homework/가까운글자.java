package com.knight.homework;

public class 가까운글자 {

  public static void main(String[] args) {

    Str str = new Str();
    str.solution("banana");


  }

}

class Str {

  public int[] solution(String s) {
    String[] answer = new String[s.length()];
    int[] number = new int[s.length()];
    for (int i = 0; i < s.length(); i++) {
      answer[i] = s.substring(i, i + 1);
//      System.out.println(answer[i]);
    }

    number[0] = -1;
    boolean boo = true;
    for (int i = 1; i < answer.length; i++) {

      for (int j = i - 1; j >= 0; j--) {

        if (answer[i].equals(answer[j])) {

          number[i] = i - j;
          System.out.println(i+"if 문의 number[i]값"+number[i]);

          break;

        } else if (boo) {
          number[i] = -1;
          System.out.println(i+"else if 문의 number[i]값"+number[i]);
        }


      }

    }

//    for (int i = 1; i < answer.length; i++) {
//      boolean isExist = false;
//      for (int j = i - 1; j >= 0; j--) {
//        if (answer[i].equals(answer[j])) {
//          number[i] = i - j;
//          isExist = true;
//          break;
//        }
//      }
//      if (!isExist) {
//        number[i] = -1;
//      }
//    }

    for (int i : number) {
      System.out.println("i = " + i);
    }
    return number;
  }
}
