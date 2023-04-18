package com.knight.homework;

import java.util.HashMap;
import java.util.Map;

public class 프로그래머스테스트 {

  public static void main(String[] args) {
    String a = "174771177";
    int[] array = {100000, 99000, 95000, 98000, 97000};

    String s = "1101";
    Solution10 user = new Solution10();
    System.out.println(user.solution(a));
  }

}

class Solution10 {

  public int solution(String s) {
    int numValue=0;
    int numKey=101;
    Map<String, Integer> map = new HashMap<>();
    for (String str : s.split("")) {
      int value = map.getOrDefault(str, 0);
      map.put(str, value + 1);
    }
    System.out.println(map);
    for(int value : map.values()){
      if(value>numValue){
        numValue = value;
      }
    }
    for(String key : map.keySet()){
      if(map.get(key)==numValue){
        int a = Integer.parseInt(key);
        if(a<numKey) {
          numKey = a;
        }
      }

    }






    return numKey;


  }
}


