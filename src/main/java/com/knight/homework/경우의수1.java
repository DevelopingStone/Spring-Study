package com.knight.homework;

public class 경우의수1 {

  public static void main(String[] args) {
//    짝수위치는 0,2,4,6,8
//    홀수위치는 2,3,5,7
    main09 user = new main09();

    System.out.println(user.solution(50));


  }

}

class main09 {

  public Long solution(int num) {
    int a = 1000000000 + 7;
    long sum = 1;
    while (num != 0) {
      if (num % 2 == 0) {
        sum = (sum * 4) % a;


      } else {
        sum = (sum * 5) % a;
      }

      num--;
    }

    return sum;
  }
}
