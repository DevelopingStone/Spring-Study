package com.knight.homework;

import java.util.HashMap;

public class 옷입기 {

  public static void main(String[] args) {

    String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
        {"green_turban", "headgear"}};
    int answer = 1;
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < clothes.length; i++) {
      String key = clothes[i][1];
      int value = map.getOrDefault(key, 0);
      map.put(key, value + 1);
    }
    for (int value : map.values()) {
      answer *= (value + 1);
    }

    System.out.println(answer-1);
  }

}


