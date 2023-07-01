package com.knight.zerobase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JavaStudy07and01 {

  public static void main(String[] args) {
    boolean start = true;

    System.out.println("[로또 당첨 프로그램]\n");
    System.out.print("로또 개수를 입력해 주세요. (숫자 1 ~ 10) :");
    int lotto = 0;
    Scanner scan = new Scanner(System.in);
    while (start) {
      lotto = scan.nextInt();
      if (lotto <= 10 && lotto > 0) {
        start = false;
      } else {
        System.out.println("로또 구매 갯수는 1~10개입니다.");
        System.out.print("로또 개수를 입력해 주세요. (숫자 1 ~ 10) :");

      }
    }

    Random number = new Random();
    List<List<Integer>> lottoNumber = new ArrayList<>();

    int num = 0;
    int z = 1;
    int count = 0;

    List<Integer> result = new ArrayList<>();
    for (int i = 0; i <= 5; i++) {
      num = number.nextInt(45) + 1;
      if (!result.contains(num)) {
        result.add(num);
      } else {
        i--;
      }


    }

    while (z <= lotto) {
      List<Integer> list = new ArrayList<>();
      System.out.print((char) (64 + z) + "    ");
      for (int i = 0; i <= 5; i++) {
        num = number.nextInt(45) + 1;

        if (!list.contains(num)) {
          list.add(num);
        } else {
          i--;
        }

      }
      Collections.sort(list);
      System.out.println(list);
      lottoNumber.add(list);

      z++;


    }

    System.out.println("\n[로또 발표]");

    Collections.sort(result);
    System.out.print("     ");
    System.out.println(result + "\n");

    System.out.println("[내 로또 결과]");
    for (int i = 0; i < lotto; i++) {
      for (Integer j : result) {
        if (lottoNumber.get(i).contains(j)) {
          count++;
        }
      }

      System.out.print(
          (char) (65 + i) + "    " + lottoNumber.get(i) + "  =>  " + count + "개  일치\n");
      count = 0;


    }


  }


}


