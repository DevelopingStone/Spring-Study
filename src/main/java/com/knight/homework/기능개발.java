package com.knight.homework;

import java.util.ArrayList;
import java.util.List;

public class 기능개발 {

  public static void main(String[] args) {

  }

}


class Solution15 {

  public List<Integer> solution(int[] progresses, int[] speeds) {
    int[] arr = new int[progresses.length];
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < progresses.length; i++) {
      arr[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
    }
    int a = arr[0];
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] <= a) {
        count++;
      } else {
        list.add(count);
        count = 0;
        a = arr[i];
        count++;
      }


    }
    list.add(count);

    return list;


  }


}