package com.knight.zerobase;

import java.util.Scanner;

public class JavaStudy08 {
  /*
  12000000 * 6% = 720000
  34000000 * 15% = 5100000
  42000000 * 24% = 10080000
  62000000 * 35% = 21700000
  150000000 * 38% = 57000000
  300000000 * 40% = 120000000
  500000000 * 42% = 210000000
  1000000000 * 45% =
   */

  public static void main(String[] args) {
    System.out.println("[과세금액 계산 프로그램]");
    System.out.print("연소득을 입력해 주세요.:");
    Scanner scan = new Scanner(System.in);
    int income = scan.nextInt();
    int taxSum = 0;
    if(1000000000<income){
      int tax = (int) ((income-1000000000)*0.45);
      taxSum = 210000000 + 80000000 + 57000000+21700000+10080000+5100000+720000+tax;
      System.out.println(" 12000000 *  6% =    720000");
      System.out.println(" 34000000 * 15% =   5100000");
      System.out.println(" 42000000 * 24% =  10080000");
      System.out.println(" 62000000 * 35% =  21700000");
      System.out.println("150000000 * 38% =  57000000");
      System.out.println("300000000 * 40% = 120000000");
      System.out.println("500000000 * 42% = 210000000");
      System.out.printf("%d * 45%% =  %d",income-1000000000,tax);

    }

    else if (500000000<income){
      int tax = (int) ((income-500000000)*0.42);
      taxSum =  80000000 + 57000000+21700000+10080000+5100000+720000+tax;
      System.out.println(" 12000000 *  6% =    720000");
      System.out.println(" 34000000 * 15% =   5100000");
      System.out.println(" 42000000 * 24% =  10080000");
      System.out.println(" 62000000 * 35% =  21700000");
      System.out.println("150000000 * 38% =  57000000");
      System.out.println("300000000 * 40% = 120000000");
      System.out.printf(" %d * 42%% =  %d",income-500000000,tax);
    }



    else if (300000000<income){
      int tax = (int) ((income-300000000)*0.4);
      taxSum = 57000000+21700000+10080000+5100000+720000+tax;
      System.out.println(" 12000000 *  6% =    720000");
      System.out.println(" 34000000 * 15% =   5100000");
      System.out.println(" 42000000 * 24% =  10080000");
      System.out.println(" 62000000 * 35% =  21700000");
      System.out.println("150000000 * 38% =  57000000");
      System.out.printf(" %d * 40%% =  %d",income-300000000,tax);
    }






    else if (150000000<income){
      int tax = (int) ((income-150000000)*0.38);
      taxSum = 21700000+10080000+5100000+720000+tax;
      System.out.println(" 12000000 *  6% =    720000");
      System.out.println(" 34000000 * 15% =   5100000");
      System.out.println(" 42000000 * 24% =  10080000");
      System.out.println(" 62000000 * 35% =  21700000");
      System.out.printf(" %d * 38%% =   %d",income-150000000,tax);
    }

    else if (88000000<income){
      int tax = (int) ((income-88000000)*0.35);
      taxSum = 10080000+5100000+720000+tax;
      System.out.println(" 12000000 *  6% =    720000");
      System.out.println(" 34000000 * 15% =   5100000");
      System.out.println(" 42000000 * 24% =  10080000");
      System.out.printf("  %d * 35%% =   %d",income-88000000,tax);
    }

    else if (46000000<income){
      int tax = (int) ((income-46000000)*0.24);
      taxSum = 5100000+720000+tax;
      System.out.println(" 12000000 *  6% =    720000");
      System.out.println(" 34000000 * 15% =   5100000");
      System.out.printf("  %d * 24%% =    %d",income-46000000,tax);
    }

    else if (12000000<income){
      int tax = (int) ((income-12000000)*0.15);
      taxSum = 720000+tax;
      System.out.println(" 12000000 *  6% =    720000");
      System.out.printf("  %d * 15%% =    %d",income-12000000,tax);
    }

    else {
      taxSum = (int) ((income)*0.06);
      System.out.printf("  %d * 6%% =     %d",income,(int)(income*0.06));
    }

    System.out.printf("\n\n[세율에 의한 세금] :                  %d",taxSum);
    System.out.printf("%n[누진공제 계산에 의한 세금] :          %d",taxSum);


  }

}
