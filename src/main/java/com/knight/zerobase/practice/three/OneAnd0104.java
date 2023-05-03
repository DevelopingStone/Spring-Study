package com.knight.zerobase.practice.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneAnd0104 {

  public static void main(String[] args) {
    Solution0104 user = new Solution0104();
    System.out.println(user.solution("111111000000"));
  }

}


class Solution0104 {

  public String solution(String s) {

    List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
    for (int i = 0; i < list.size()-3; i++) {
      if ("1".equals(list.get(i))) {
        if("1".equals(list.get(i+3))&&!"1".equals(list.get(i+1))&&!"1".equals(list.get(i+2)))
        return "NO";

      }
    }

    return "YES";


  }
}