package com.knight.zerobase;
/*
 박강락
 */

import java.util.Scanner;

public class JavaStudy08 {

  private static final int[] TAX_RATES = {6, 15, 24, 35, 38, 40, 42, 45};
  private static final int[] THRESHOLDS = {12000000, 46000000, 88000000, 150000000, 300000000,
      500000000, 1000000000};
  private static final int[] DEDUCTIONS = {720000, 5100000, 10080000, 21700000, 57000000, 120000000,
      210000000};
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

    Scanner scanner = new Scanner(System.in);

    System.out.println("[과세금액 계산 프로그램]");
    System.out.print("연소득을 입력해 주세요.: ");

    int income = scanner.nextInt();
    int taxSum = calculateTax(income);

    System.out.printf("%n[세율에 의한 세금] :                  %,d원", taxSum);
    System.out.printf("%n[누진공제 계산에 의한 세금] :          %,d원", taxSum);
  }

  private static int calculateTax(int income) {
    int taxSum = 0;
    int remainingIncome = income;

    for (int i = 0; i < THRESHOLDS.length; i++) {
      if (remainingIncome <= 0) {
        break;
      }

      int threshold = THRESHOLDS[i];
      int deduction = i == 0 ? DEDUCTIONS[i] : DEDUCTIONS[i] - DEDUCTIONS[i - 1];
      int rate = i == 0 ? TAX_RATES[i] : TAX_RATES[i] - TAX_RATES[i - 1];

      if (remainingIncome > threshold) {
        int taxableIncome = remainingIncome - threshold;
        int tax = (int) (taxableIncome * rate / 100.0);
        int effectiveTax = Math.max(tax - deduction, 0);
        taxSum += effectiveTax;

        System.out.printf("%,d원 * %d%% = %,d원%n", taxableIncome, rate, tax);
        remainingIncome -= taxableIncome;
      } else {
        int tax = (int) (remainingIncome * rate / 100.0);
        int effectiveTax = Math.max(tax - deduction, 0);
        taxSum += effectiveTax;

        System.out.printf("%,d원 * %d%% = %,d원%n", remainingIncome, rate, tax);
        remainingIncome = 0;
      }
    }

    return taxSum;
  }


}
