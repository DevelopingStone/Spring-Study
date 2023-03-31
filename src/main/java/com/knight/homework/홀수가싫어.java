package com.knight.homework;

import java.util.ArrayList;
import java.util.List;

public class 홀수가싫어 {

  public static void main(String[] args) {

    Main1 user = new Main1();
    user.solution(10);


  }

}

class Main1 {


  public List<Integer> solution(int n) {
    List<Integer> list = new ArrayList<>();

    for (int i = 1; i <= n; i += 2) {

      list.add(i);


    }

    return list;
  }


}
