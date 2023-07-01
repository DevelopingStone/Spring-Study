package com.knight.homework;

public class 카탈랑수 {

  public static void main(String[] args) {
    main06 user = new main06();

    System.out.println(user.solution(4));


  }

}


class main06 {

  public int solution(int num) {

    int sum = 0;
    if (num <= 1) {
      return 1;
    }
    for (int i = 0; i < num; i++) {
      sum += solution(i) * solution(num - 1 - i);
      System.out.println("i = " + i);
      System.out.println("num = " + num);
      System.out.println("sum = " + sum);

    }

    return sum;
  }

}