package com.knight.zerobase.practice.two;

import java.util.ArrayList;
import java.util.List;

public class ThreeAnd0305 {

  public static void main(String[] args) {
    Solution0305 user = new Solution0305();
    user.solution(7, 3);
  }

}

class Solution0305 {

  public int solution(int N, int K) {
    List<Integer> list = new ArrayList<>();
    int index = 0;
//    1번부터 N번까지 순서를 담아줄 list 생성
//    사람순서를 추적해줄 index 생성, 1번사람부터 시작이니 index번호는 0부터이다.

    for (int i = 1; i <= N; i++) {
      list.add(i);
    }
//    1번부터 N번까지 순서 담기

    while (list.size() > 1) {
      index = (index + K - 1) % (list.size());
      list.remove(index);
      System.out.println(list);
    }
//    테이블 문제가 나올경우 공식같은건데, 말그대로 index를 추적하면된다.
//    index : 현재위치 / K : 증가되는수 / -1을 하는이유는 인덱스와 사람번호의 차이 / list.size : 전체인원

    return list.get(0);
  }
}
