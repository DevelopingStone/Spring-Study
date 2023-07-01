package com.knight.zerobase.practice.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiveAnd0503 {

  public static void main(String[] args) {

    int[] cards = {4, 8, 6, 4, 2, 4, 10, 10};

    Solution0503 user = new Solution0503();
    System.out.println(user.solution(cards));
  }

}

class Solution0503 {

  public int solution(int[] cards) {

    List<Integer> list = new ArrayList<>();
    for (int i : cards) {
      list.add(i);
    }
    list.sort(Collections.reverseOrder());
//  cards 배열을 list에 추가후 내림차순으로 정렬

    while (list.size() > 1) {
      if (list.get(0) - list.get(1) > 0) {
        list.add(list.get(0) - list.get(1));
        list.remove(0);
        list.remove(0);
        list.sort(Collections.reverseOrder());
      } else if (list.get(0) - list.get(1) == 0) {
        list.remove(0);
        list.remove(0);
      }
//      list 값이 1남을때까지 반복한다.
//      a>b경우 / 1.list.remove(0) 두번실행 / 2.a>b값 추가 / 3.내림차순정렬
//      a>b경우 / 1.list.remove(0) 두번실행

      if (list.size() == 1) {
        return list.get(0);
      } else if (list.size() == 0) {
        return 0;
      }
    }
    return list.get(0);
  }
}


