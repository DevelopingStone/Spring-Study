package com.knight.homework;

public class 피자나눠먹기 {

  public static void main(String[] args) {
    Main4 user = new Main4();

    System.out.println(user.solution(7,10));
  }

}

class Main4{

  double result = 0;
  public double solution(double slice, double n) {

    return result = Math.ceil(n/slice);
  }
}
