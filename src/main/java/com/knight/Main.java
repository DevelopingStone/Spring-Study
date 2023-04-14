package com.knight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    List<Integer> result = josephus(n, k);
    System.out.print("<");
    for (int i = 0; i < result.size(); i++) {
      System.out.print(result.get(i));
      if (i != result.size() - 1) {
        System.out.print(", ");
      }
    }
    System.out.print(">");
  }

  public static List<Integer> josephus(int n, int k) {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      list.add(i);
    }

    List<Integer> result = new ArrayList<>();
    int index = 0;
    while (!list.isEmpty()) {
      index = (index + k - 1) % list.size(); // 제거할 요소의 인덱스 계산
      result.add(list.remove(index));
    }

    return result;
  }
}
