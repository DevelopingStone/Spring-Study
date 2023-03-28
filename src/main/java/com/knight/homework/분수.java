package com.knight.homework;

public class 분수 {

  public static void main(String[] args) {

    Bun bun = new Bun();


    
    for(int i : bun.solution(9,2,1,3)){
      System.out.println("i = " + i);
    }

  }

}


class Bun {

  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int a = denom1 * denom2; // 공통 분모
    int b = numer1 * denom2 + numer2 * denom1; // 분자 합

    int gcd = gcd(b, a); // 최대공약수
    int[] answer = {b / gcd, a / gcd}; // 기약분수

    return answer;
  }

  // 최대공약수를 계산하는 메소드
  private int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }
}



