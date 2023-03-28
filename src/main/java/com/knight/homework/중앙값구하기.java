package com.knight.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 중앙값구하기 {

  public static void main(String[] args) {
    int[] a = {1,2,7,10,11};
    int[] b = {9,-1,0};
    Jung j = new Jung();
    j.solution(a);
    j.solution(b);

  }

}

class Jung {

  public int solution(int[] array) {
    List<Integer> num = new ArrayList<>();

    for (int i : array) {
      num.add(i);
    }
    Collections.sort(num);
    int middleIndex = (num.size() - 1) / 2;
    int middleValue = num.get(middleIndex);
    System.out.println(middleValue); // 3

    return middleValue;

  }
}
