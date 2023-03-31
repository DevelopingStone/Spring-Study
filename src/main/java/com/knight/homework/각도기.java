package com.knight.homework;

public class 각도기 {

  public static void main(String[] args) {

    Main3 user = new Main3();
    user.solution(80);


  }


}


class Main3 {

  public int solution(int gak) {
    if (gak > 0 || gak < 90) {
      return 1;
    } else if (gak == 90) {
      return 2;
    } else if (gak > 90 || gak < 180) {
      return 3;
    } else {
      return 4;
    }
  }


}

