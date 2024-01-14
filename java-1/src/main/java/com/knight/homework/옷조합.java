package com.knight.homework;

import java.util.HashMap;

public class 옷조합 {

  public static void main(String[] args) {

    String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
        {"green_turban", "headgear"}};
    Main15 user = new Main15();
    System.out.println(user.solution(clothes));

  }

}


class Main15 {

  public int solution(String[][] str) {

    HashMap<String, Integer> hm = new HashMap<>();
    int result = 1;
    for (int i = 0; i < str.length; i++) {

      String key = str[i][1];
      int value = hm.getOrDefault(key, 0);
      hm.put(key, value + 1);

    }
    for (Integer value : hm.values()) {

      result *= (value + 1);


    }
    return result-1;

  }

}