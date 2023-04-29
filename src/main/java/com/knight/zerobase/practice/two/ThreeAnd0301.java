package com.knight.zerobase.practice.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ThreeAnd0301 {

  public static void main(String[] args) {

    Solution0301 user = new Solution0301();
    System.out.println(user.solution("322211123"));

  }

}


class Solution0301 {

  public String solution(String s) {
    Map<String, Integer> map = new LinkedHashMap<>();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list1.add(i);
    }
    for (String str : s.split("")) {
      int value = map.getOrDefault(str, 0);
      map.put(str, value + 1);
    }

    List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
    Collections.sort(entryList, Map.Entry.comparingByValue(Collections.reverseOrder()));

    StringBuilder sb = new StringBuilder();
    for (Map.Entry<String, Integer> entry : entryList) {
      sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
    }
    System.out.println(entryList);
    for (Map.Entry<String, Integer> entry : entryList) {
      list2.add(Integer.valueOf(entry.getKey()));
    }
    for (int i : list1) {
      if (!list2.contains(i)) {
        list2.add(i);
      }
    }
    String str = "";
    for (int i : list2) {
      str += i;
      str += " ";
    }
    str = str.substring(0, str.length() - 1);

    return str;
  }
}


