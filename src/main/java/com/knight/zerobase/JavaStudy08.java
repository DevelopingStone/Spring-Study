package com.knight.zerobase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JavaStudy08 {

  public static void main(String[] args) {
    System.out.println("[로또 당첨 프로그램]");
    System.out.print("로또 개수를 입력해 주세요. (숫자 1 ~ 10) :");

    Scanner scan = new Scanner(System.in);
    int lotto = scan.nextInt();
    if (lotto > 10) {
      System.out.println("로또 최대구매 갯수는 10개입니다. 시스템을 종료합니다.");
      return;
    }

    // 로또 번호 생성
    Random number = new Random();
    List<Integer> lottoNumbers = new ArrayList<>();
    for (int i = 0; i < 6; i++) {
      int num = number.nextInt(45) + 1;
      if (!lottoNumbers.contains(num)) {
        lottoNumbers.add(num);
      } else {
        i--;
      }
    }
    Collections.sort(lottoNumbers);

    // 각 플레이어의 로또 번호 생성
    List<List<Integer>> playerNumbers = new ArrayList<>();
    for (int i = 0; i < lotto; i++) {
      List<Integer> numbers = new ArrayList<>();
      for (int j = 0; j < 6; j++) {
        int num = number.nextInt(45) + 1;
        if (!numbers.contains(num)) {
          numbers.add(num);
        } else {
          j--;
        }
      }
      Collections.sort(numbers);
      playerNumbers.add(numbers);
    }

    // 각 플레이어의 로또 번호 출력
    System.out.println();
    for (int i = 0; i < lotto; i++) {
      System.out.printf("%c %s", 65 + i, playerNumbers.get(i));
      int matchedCount = getMatchedCount(playerNumbers.get(i), lottoNumbers);
      System.out.println();

    }

    // 로또 당첨 번호 출력
    System.out.println("\n[로또 발표]");
    System.out.printf("  %s%n", lottoNumbers+"\n");

    // 각 플레이어의 로또 번호와 일치하는 번호의 갯수 출력
    for (int i = 0; i < lotto; i++) {
      int matchedCount = getMatchedCount(playerNumbers.get(i), lottoNumbers);
      System.out.printf("%c %s => %d개 일치%n", 65 + i, playerNumbers.get(i), matchedCount);
    }
  }

  private static int getMatchedCount(List<Integer> playerNumbers, List<Integer> lottoNumbers) {
    int matchedCount = 0;
    for (int i = 0; i < playerNumbers.size(); i++) {
      if (lottoNumbers.contains(playerNumbers.get(i))) {
        matchedCount++;
      }
    }
    return matchedCount;
  }
}
