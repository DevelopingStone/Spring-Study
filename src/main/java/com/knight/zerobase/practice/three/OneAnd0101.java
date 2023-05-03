package com.knight.zerobase.practice.three;

import java.util.*;

public class OneAnd0101 {

}

class Solution0101 {

  public boolean solution(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    for (int num : arr) {
      set.add(num);
      int value = map.getOrDefault(num, 0);
      map.put(num, value + 1);
    }
//    getOrDefault() 메소드를 통해 Map에 중복되는 숫자를 카운트한다.

    List<Integer> list = new ArrayList<>(set);
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (map.get(list.get(i)) == map.get(list.get(j))) {
          return false;
        }
      }
    }
//    List넣은 Set값을 하나씩 꺼내면서 중복되는수가 있는지 확인

    return true;
  }
}
