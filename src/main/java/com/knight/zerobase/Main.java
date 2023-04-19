package com.knight.zerobase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
    String[] bj = {"혁준", "하밥", "양상", "심심이", "소스왕"};
    String[] one = {"혁준", "양상"};
    String[] two = {"심심이", "소스왕"};
    int[] arr = {3, 76, 24};
    String s = "Hello, World!?";

    int[] A = {6, 12, 4};
    int[] orders = {2, 4, 5, 7};
    int[] array1 = {31, 21, 5, 12, 1};
    int[] emergency = {3, 76, 24};
    System.out.println(user.solution(emergency));


  }

}


class Solution {

  public int[] solution(int[] emergency) {
    List<Integer> list = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    for (int num : emergency) {
      list.add(num);
      result.add(num);

    }

    Collections.sort(list, Collections.reverseOrder());
    System.out.println(result);
    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size(); j++) {
        if (result.get(i).equals(list.get(j))) {
          emergency[i] = j + 1;
        }
      }
    }

    return emergency;
  }
}