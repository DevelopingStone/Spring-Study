package com.knight.homework;

public class 피자니눠먹기1 {

  public static void main(String[] args) {

  }
}

class Main2 {

  public int solution(int n) {

    for (int result = 1; result <= 100; result++) {
      if (6 * result % n == 0) {

        return result;

      }


    }

    return n;
  }

}
