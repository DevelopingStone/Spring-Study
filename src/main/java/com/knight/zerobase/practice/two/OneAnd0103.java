package com.knight.zerobase.practice.two;

import java.util.LinkedHashMap;

public class OneAnd0103 {

  public static void main(String[] args) {

    Solution0103 user = new Solution0103();
    System.out.println(user.solution("가나다라", "바나나 드래곤 스리랑카 오염"));

  }

}


class Solution0103 {

  public boolean solution(String p, String s) {
    int num = 0;
    LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
    LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
//  p문자열과 s문자열을 각각 담을 두개의 HashMap을 준비한다.
//  Linked를 붙이면 put으로 추가한 순서대로 정렬된다.

    for (String str : p.split("")) {
      num = map1.getOrDefault(str, 0);
      map1.put(str, num + 1);
    }
    for (String str : s.split(" ")) {
      num = map1.getOrDefault(str, 0);
      map2.put(str, num + 1);
    }
//    getOrDefault 메소드를 통해 HashMap에 담기전 동일한 단어가 몇개가 있는지 확인한다.

    if (map1.size() == map2.size()) {
      return true;
    } else {
      return false;
    }
//   최종적으로 Map1과 Map2의 사이즈가 동일하면 true, 아니면 false 이다.


  }
}
