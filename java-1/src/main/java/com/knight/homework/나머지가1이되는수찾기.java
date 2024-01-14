package com.knight.homework;

public class 나머지가1이되는수찾기 {

  public static void main(String[] args) {

    main6 user = new main6();

    System.out.println(user.solution(10));

  }

}

class main6 {

  int num = 0;

  public int solution(int n) {

    for (int i = 2; i < n; i++) {
      if (n % i == 1) {
        num = n;

        break;
      }
    }

    return num;
  }

}
