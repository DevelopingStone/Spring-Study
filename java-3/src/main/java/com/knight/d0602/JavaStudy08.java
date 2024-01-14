package com.knight.d0602;

/*
박강락
 */

import java.math.*;
import java.util.*;

public class JavaStudy08 {
    static int i = 0;
    static BigDecimal[] howMuchTax = new BigDecimal[8];
    final static int[] standardMoney = {0, 12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000, 0};
    final static int[] progressiveTax = {0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};
    final static BigDecimal[] taxRatio = {new BigDecimal("0.06"), new BigDecimal("0.15"), new BigDecimal("0.24"), new BigDecimal("0.35"), new BigDecimal("0.38"), new BigDecimal("0.40"), new BigDecimal("0.42"), new BigDecimal("0.45")};

    public static BigDecimal calcStandardTax(int money) {
        BigDecimal totalTax = BigDecimal.ZERO;
        BigDecimal bdMoney = new BigDecimal(money);

        if (bdMoney.compareTo(new BigDecimal(Math.abs(standardMoney[i + 1] - standardMoney[i]))) <= 0) {
            howMuchTax[i] = bdMoney.multiply(taxRatio[i]);
            System.out.printf("%11d * %2d%% = %10d\n", money, taxRatio[i].multiply(new BigDecimal(100)).intValue(), howMuchTax[i].intValue());

            return howMuchTax[i];
        } else if (bdMoney.compareTo(new BigDecimal(Math.abs(standardMoney[i + 1] - standardMoney[i]))) > 0) {
            bdMoney = bdMoney.subtract(new BigDecimal(standardMoney[i + 1] - standardMoney[i]));
            howMuchTax[i] = new BigDecimal(standardMoney[i + 1] - standardMoney[i]).multiply(taxRatio[i]);
            System.out.printf("%11d * %2d%% = %10d\n", standardMoney[i + 1] - standardMoney[i], taxRatio[i].multiply(new BigDecimal(100)).intValue(), howMuchTax[i].intValue());
            i++;

            calcStandardTax(bdMoney.intValue());
        }
        for (BigDecimal muchTax : howMuchTax) {
            if (muchTax != null) {
                totalTax = totalTax.add(muchTax);
            }
        }

        return totalTax;
    }

    public static BigDecimal calcProgressiveTax(int money) {
        BigDecimal totalTax;
        BigDecimal bdMoney = new BigDecimal(money);

        if (bdMoney.compareTo(new BigDecimal(standardMoney[1])) <= 0) {
            totalTax = bdMoney.multiply(taxRatio[0]).subtract(new BigDecimal(progressiveTax[0]));
        } else if (bdMoney.compareTo(new BigDecimal(standardMoney[2])) <= 0) {
            totalTax = bdMoney.multiply(taxRatio[1]).subtract(new BigDecimal(progressiveTax[1]));
        } else if (bdMoney.compareTo(new BigDecimal(standardMoney[3])) <= 0) {
            totalTax = bdMoney.multiply(taxRatio[2]).subtract(new BigDecimal(progressiveTax[2]));
        } else if (bdMoney.compareTo(new BigDecimal(standardMoney[4])) <= 0) {
            totalTax = bdMoney.multiply(taxRatio[3]).subtract(new BigDecimal(progressiveTax[3]));
        } else if (bdMoney.compareTo(new BigDecimal(standardMoney[5])) <= 0) {
            totalTax = bdMoney.multiply(taxRatio[4]).subtract(new BigDecimal(progressiveTax[4]));
        } else if (bdMoney.compareTo(new BigDecimal(standardMoney[6])) <= 0) {
            totalTax = bdMoney.multiply(taxRatio[5]).subtract(new BigDecimal(progressiveTax[5]));
        } else if (bdMoney.compareTo(new BigDecimal(standardMoney[7])) <= 0) {
            totalTax = bdMoney.multiply(taxRatio[6]).subtract(new BigDecimal(progressiveTax[6]));
        } else {
            totalTax = bdMoney.multiply(taxRatio[7]).subtract(new BigDecimal(progressiveTax[7]));
        }
        return totalTax;
    }

    public static void main(String[] args) {
        BigDecimal totalStandardTax;
        BigDecimal totalProgressiveTax;
        System.out.println("[과세금액 계산 프로그램]");

        System.out.print("연소득을 입력해주세요.: ");
        Scanner scanner = new Scanner(System.in);
        int annualSalary = scanner.nextInt();

        totalStandardTax = calcStandardTax(annualSalary);
        System.out.println();

        totalProgressiveTax = calcProgressiveTax(annualSalary);
        System.out.println();
        if (annualSalary <= 12000000) {
            totalProgressiveTax = BigDecimal.ZERO;
        }

        System.out.printf("[세율에 의한 세금]:\t\t\t%d\n", totalStandardTax.intValue());
        System.out.printf("[누진공제 계산에 의한 세금]:\t%d\n", totalProgressiveTax.intValue());
    }
}
