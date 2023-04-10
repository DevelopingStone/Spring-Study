package com.knight.homework;

public class 하노이의탑 {

  public static void main(String[] args) {

    main10 user = new main10();
    user.solution(3);


  }

}


class main10 {

  static StringBuffer sb;

  public static void hanoi(int n, int start, int mid, int to) {
    if (n == 1) {
      System.out.print(start + " " + to + "\n");
      return;
    }
    hanoi(n - 1, start, to, mid);
    System.out.print(start + " " + to + "\n");
    hanoi(n - 1, mid, start, to);
  }

  public static void solution(int n) {


    hanoi(n, 1, 2, 3);

  }


}