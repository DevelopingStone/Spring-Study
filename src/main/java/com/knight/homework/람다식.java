package com.knight.homework;

import java.util.HashSet;
import java.util.Set;

interface Result {

  public abstract int plus1(int x, int y);


}

public class 람다식 {

  public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();
    set.add(3);
    set.add(2);
    set.add(1);
    set.add(4);
    set.add(5);

    // 저장된 데이터 출력
    for (int num : set) {
      System.out.println(num);
    }

    System.out.println(set);
  }


}
