package com.knight.zerobase;

import java.util.Scanner;

public class JavaStudy02 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("[캐시백 계산]");
    System.out.print("결제 금액을 입력해 주세요. (금액):");
    int value = scan.nextInt();

    int result = value / 10;
    if (result <= 100 && result >= 0) {
      result = 0;
    }
    if (result >= 100 && result <= 199) {
      result = 100;
    }
    if (result >= 200 && result <= 299) {
      result = 200;
    }
    if (result >= 300) {
      result = 300;
    }

    System.out.println("결제 금액은 " + value + "원이고, 캐시백은 " + result + "원 입니다.");


  }

}
