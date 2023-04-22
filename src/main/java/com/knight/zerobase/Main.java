package com.knight.zerobase;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Main {

  public static void main(String[] args) {

    String[] name = {"mumu", "soe", "poe", "kai", "mine"};
    String[] call = {"kai", "kai", "mine", "mine"};
    Solution user = new Solution();
    System.out.println(user.solution(name, call));

  }

}


class Solution {

  public String[] solution(String[] players, String[] callings) {
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    String call = "";
    for (int i = 0; i < players.length; i++) {
      map.put(players[i], i);
    }
    System.out.println(map);

    for (int i = 0; i < callings.length; i++) {
      int num = map.get(callings[i]);



      call = players[num - 1];
      players[num - 1] = players[num];
      players[num] = call;
      map.put(players[num], num);
      map.put(players[num - 1], num - 1);

    }

    System.out.println(Arrays.toString(players));

    return players;


  }
}












