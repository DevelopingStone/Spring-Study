package com.knight.zerobase;
/*
 박강락
 */
import java.util.Scanner;

public class JavaStudy08 {
  static int i = 0;
  static int[] howMuchTax = new int[8];
  final static int[] standardMoney = {0, 12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000, 0};
  final static int[] progressiveTax = {0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};
  final static double[] taxRatio = {0.06d, 0.15d, 0.24d, 0.35d, 0.38d, 0.40d, 0.42d, 0.45d};

  public static int calcStandardTax(int money) {
    int totalTax = 0;

    if (money <= Math.abs(standardMoney[i + 1] - standardMoney[i])) {
      howMuchTax[i] = (int) (money * taxRatio[i]);
      System.out.printf("%11d * %2d%% = %10d\n", money, (int) (taxRatio[i] * 100), howMuchTax[i]);

      return howMuchTax[i];
    } else if (money > Math.abs(standardMoney[i + 1] - standardMoney[i])) {
      money = money - (standardMoney[i + 1] - standardMoney[i]);
      howMuchTax[i] = (int) ((standardMoney[i + 1] - standardMoney[i]) * taxRatio[i]);
      System.out.printf("%11d * %2d%% = %10d\n", standardMoney[i + 1] - standardMoney[i], (int) (taxRatio[i] * 100), howMuchTax[i]);
      i++;

      calcStandardTax(money);
    }
    for (int muchTax : howMuchTax) totalTax += muchTax;

    return totalTax;
  }

  public static int calcProgressiveTax(int money) {
    int totalTax;

    if (money <= standardMoney[1]) { //1200만원 이하
      totalTax = (int) (money * taxRatio[0]) - progressiveTax[0];
    } else if (money <= standardMoney[2]) { //4600만원 이하
      totalTax = (int) (money * taxRatio[1]) - progressiveTax[1];
    } else if (money <= standardMoney[3]) { //8800만원 이하
      totalTax = (int) (money * taxRatio[2]) - progressiveTax[2];
    } else if (money <= standardMoney[4]) { //15000만원 이하
      totalTax = (int) (money * taxRatio[3]) - progressiveTax[3];
    } else if (money <= standardMoney[5]) { //30000만원 이하
      totalTax = (int) (money * taxRatio[4]) - progressiveTax[4];
    } else if (money <= standardMoney[6]) { //50000만원 이하
      totalTax = (int) (money * taxRatio[5]) - progressiveTax[5];
    } else if (money <= standardMoney[7]) { //100000만원 이하
      totalTax = (int) (money * taxRatio[6]) - progressiveTax[6];
    } else { //100000만원 초과
      totalTax = (int) (money * taxRatio[7]) - progressiveTax[7];
    }
    return totalTax;
  }

  public static void main(String[] args) {
    int totalStandardTax;
    int totalProgressiveTax;
    System.out.println("[과세금액 계산 프로그램]");

    System.out.print("연소득을 입력해주세요.: ");
    Scanner scanner = new Scanner(System.in);
    int annualSalary = scanner.nextInt();

    totalStandardTax = calcStandardTax(annualSalary);
    System.out.println();

    totalProgressiveTax = calcProgressiveTax(annualSalary);
    System.out.println();

    System.out.printf("[세율에 의한 세금]:\t\t\t%d\n", totalStandardTax);
    System.out.printf("[누진공제 계산에 의한 세금]:\t%d\n", totalProgressiveTax+1);
  }
}