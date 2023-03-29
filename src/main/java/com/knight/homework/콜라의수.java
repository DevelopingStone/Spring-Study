package com.knight.homework;

public class 콜라의수 {

  public static void main(String[] args) {
    Main user = new Main();

    System.out.println(user.solution(3, 1, 20));

  }

}


class Main {

  int share = 0;
  int rest = 0;
  int answer = 0;
  int sum = 0;
  boolean result = true;

  public int solution(int a, int b, int n) {
    sum = n;
    while (result) {
      if (sum / a != 0) {
        share = (sum / a)*b;
        rest = sum % a;
        answer += share;
        sum = share + rest;


      } else if (sum / a == 0) {
        result = false;
      }
    }

    return answer;
  }

}
