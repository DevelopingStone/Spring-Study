package com.knight.homework;

import java.util.HashMap;

public class 위장 {

  public static void main(String[] args) {

    String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
        {"green_turban", "headgear"}};
    Main14 user = new Main14();
    System.out.println(user.solution(clothes));

  }

}


class Main14 {

  public int solution(String[][] clothes) {
    int answer = 1;
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    for (int i = 0; i < clothes.length; i++) {
      String key = clothes[i][1];

      int value = map.getOrDefault(key, 0);

      map.put(key, value + 1);

    }

    for (int value : map.values()) {

      answer = answer * (value + 1);
    }
    return answer - 1;
  }


}