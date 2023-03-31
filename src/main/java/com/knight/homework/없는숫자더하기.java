package com.knight.homework;

public class 없는숫자더하기 {

  public static void main(String[] args) {

    main7 user = new main7();

  }

}

class main7 {

  int sum = 0;

  public int solution(int[] numbers) {

    for (int i : numbers) {
      sum += i;
    }

    return 45 - sum;


  }

}
