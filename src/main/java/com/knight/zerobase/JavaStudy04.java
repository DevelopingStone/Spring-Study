package com.knight.zerobase;

import java.util.Random;
import java.util.Scanner;

public class JavaStudy04 {

  public static void main(String[] args) {
    Random random = new Random();

    Scanner scan = new Scanner(System.in);
    System.out.println("[주민등록번호 계산]");

    System.out.print("출생년도를 입력해 주세요. (yyyy) : ");
    String yyyy = scan.next();

    System.out.print("출생월을 입력해 주세요. (mm) : ");
    String mm = scan.next();

    System.out.print("출생일을 입력해 주세요. (dd) : ");
    String dd = scan.next();

    System.out.print("성별을 입력해 주세요.(m/f) : ");
    String sex = scan.next();

    if (sex.equals("m")) {
      System.out.print(yyyy + mm + dd + "-" + 3);
      for (int i = 0; i < 6; i++) {
        int randomNumber = random.nextInt(10); // 0부터 9까지의 랜덤한 정수 생성
        System.out.print(randomNumber);
      }
    } else {
      System.out.print(yyyy + mm + dd + "-" + 4);
      for (int i = 0; i < 6; i++) {
        int randomNumber = random.nextInt(10); // 0부터 9까지의 랜덤한 정수 생성
        System.out.print(randomNumber);
      }
    }


  }


}
