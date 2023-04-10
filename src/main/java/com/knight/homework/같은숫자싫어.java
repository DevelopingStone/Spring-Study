package com.knight.homework;

import java.util.ArrayList;
import java.util.List;

public class 같은숫자싫어 {

  public static void main(String[] args) {
    int[] array = {4, 4, 4, 3, 3, 2};
    main11 user = new main11();
    System.out.println(user.solution(array));

  }


}


class main11 {

  public List<Integer> solution(int[] num) {
    List<Integer> list = new ArrayList<>();
    int[] arr = num;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if(arr[i]==arr[j]){
          i++;

        } else {
          list.add(arr[i]);
          i++;

        }
      }

    }
    list.add(arr[arr.length-1]);

    return list;
  }
}
