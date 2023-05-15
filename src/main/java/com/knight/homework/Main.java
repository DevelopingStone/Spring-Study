package com.knight.homework;


import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
    int[][] arr = {{-3, -1}, {-2, 3}, {2, 3}};
    System.out.println(user.solution(arr));
  }


}


class Solution {

  public int solution(int[][] lines) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < lines.length; i++) {
      int min = Math.min(lines[i][0], lines[i][1]);
      System.out.println("min = " + min);
      int max = Math.max(lines[i][0], lines[i][1]);
      System.out.println("max = " + max);

      /*for (int j = min; j < max; j++) {

        int value = map.getOrDefault(j, 0);
        map.put(j, value + 1);


      }*/

      for(int j=min; j<max; j++){
        int value = map.getOrDefault(j,0);
        map.put(j,value+1);

      }




    }
    System.out.println("map = " + map);

    int answer = 0;
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
      if(entry.getValue()>=2){
        answer++;
      }
    }

    /*for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getKey() >= 2) {
        System.out.println("entry.getValue() = " + entry.getValue());
        answer++;
      }
    }*/



    return answer;
  }
}