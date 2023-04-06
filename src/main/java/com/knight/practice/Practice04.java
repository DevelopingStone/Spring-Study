package com.knight.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice04 {

  public static void main(String[] args) {

    Main05 user = new Main05();
    System.out.println(user.solution(1028));


  }

}


class Main05 {

  public boolean solution(int a) {
    String str = Integer.toString(a);
    List<Integer> list = new ArrayList<>();
    List<Integer> all = new ArrayList<>();

    for (int i = 0; i < str.length(); i++) {
      list.add((int) str.charAt(i) - '0');

    }
    System.out.printf("입력값은 : %d , 쪼갠값은 : %s %n", a, list);

    int sum = 0;
    while (true) {
      sum = 0;

      for (Integer integer : list) {
        sum += integer * integer;

      }
      if (all.contains(sum)) {
        System.out.println("sum 값 : " + sum);
        System.out.printf("%d 는 무한반복되므로 행복한수가 아닙니다.%n", a);
        return false;
      }
      all.add(sum);
      list.add(sum);
      System.out.println("sum 값 : " + sum);
      list = new ArrayList<>();
      str = Integer.toString(sum);
      for (int i = 0; i < str.length(); i++) {
        list.add((int) str.charAt(i) - '0');
      }
      if (sum == 1) {
        System.out.printf("%d는 1로 끝나는 수 이기 때문에 행복한수 입니다.%n", a);
        return true;
      }


    }


  }


}

