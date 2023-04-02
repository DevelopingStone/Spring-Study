package com.knight.zerobase;

import java.util.Scanner;

public class JavaStudy03 {

  public static void main(String[] args) {
    System.out.println("[입장권 계산]");
    Scanner scan = new Scanner(System.in);

    System.out.print("나이를 입력해 주세요. (숫자) : ");
    int age = scan.nextInt();

    System.out.print("입장시간을 입력해 주세요. (숫자입력) : ");
    int time = scan.nextInt();

    System.out.print("국가유공자 여부를 입력해 주세요.(y/n) : ");
    String national = scan.next();

    System.out.print("복지카드 여부를 입력해 주세요.(y/n) : ");
    String welfare = scan.next();

    int price;
    if (age < 3) {
      price = 0;
    } else if (age < 13) {
      price = 4000;
    } else if (time >= 17) {
      price = 4000;
    } else if (national.equals("y") || welfare.equals("y")) {
      price = 8000;
    } else {
      price = 10000;
    }
    System.out.println("입장료 : " + price);


  }

}
