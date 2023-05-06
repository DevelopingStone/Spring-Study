package com.knight.homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    int[] num = {11, 11};
    String str = "x";
    Solution user = new Solution();
    System.out.println(user.solution(str));


  }


}


class Solution {

  public String solution(String polynomial) {

    List<String> list = new ArrayList<>(Arrays.asList(polynomial.split(" ")));
    int sum = 0;
    int sumX = 0;
    System.out.println(list);
    for (int i = 0; i < list.size(); i += 2) {
      if (list.get(i).matches("[0-9]")) {
        sum += Integer.parseInt(list.get(i));
      } else {
        if ("x".equals(list.get(i))) {
          sumX++;
        } else {
          sumX += Integer.parseInt(String.valueOf(list.get(i).charAt(0)));
        }
      }

    }

    System.out.println(sum);
    System.out.println(sumX);



    return null;
  }
}