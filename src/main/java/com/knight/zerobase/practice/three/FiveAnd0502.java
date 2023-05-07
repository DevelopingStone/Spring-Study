package com.knight.zerobase.practice.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiveAnd0502 {

  public static void main(String[] args) {
    Solution0502 user = new Solution0502();
    System.out.println(user.solution(-123456,1));
  }
}

class Solution0502 {
  public int solution(int N, int K) {
    String numString = Integer.toString(N);
    String keyString = Integer.toString(K);
    List<String> list = new ArrayList<>(Arrays.asList(numString.split("")));
    StringBuilder sb = new StringBuilder();
    if("-".equals(list.get(0))){
      list.remove(0);
      for (int i = 0; i < list.size(); i++) {
        if (Integer.parseInt(list.get(i)) >= Integer.parseInt(keyString)) {
          list.add(i, keyString);
          break;
        } else if (i == list.size() - 1) {
          list.add(i + 1, keyString);
          break;
        }
      }

      for (String word : list) {
        sb.append(word);
      }
      int a = Integer.parseInt(sb.toString());

      return -a;


    }
    else {
      for (int i = 0; i < list.size(); i++) {
        if (Integer.parseInt(list.get(i)) < Integer.parseInt(keyString)) {
          list.add(i, keyString);
          break;
        } else if (i == list.size() - 1) {
          list.add(i + 1, keyString);
          break;
        }
      }

      for (String word : list) {
        sb.append(word);
      }
      int a = Integer.parseInt(sb.toString());

      return a;
    }

  }
}