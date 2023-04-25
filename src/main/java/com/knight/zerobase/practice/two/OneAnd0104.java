package com.knight.zerobase.practice.two;

import java.util.HashMap;
import java.util.Map;

public class OneAnd0104 {

}

class Solution0104 {

  public int solution(String s) {
    int num = 0;
    Map<String, Integer> map1 = new HashMap<>();
//  s문자열을 HashMap을 준비한다.

    for (String str : s.split(" ")) {
      num = map1.getOrDefault(str, 0);
      map1.put(str, num + 1);
    }
//  " " 스페이스바를 기준으로 단어를 구분짓고, getOrDefault메소드를 통해
//  중복되면 기존값에 +1, 중복이아니면 1을 저장한다.

    return map1.size();

  }
}