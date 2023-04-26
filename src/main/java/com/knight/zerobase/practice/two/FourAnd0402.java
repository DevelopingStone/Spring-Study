package com.knight.zerobase.practice.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourAnd0402 {

  public static void main(String[] args) {

    int[] A = { 1,2,3, 4,5};
    Solution0402 user = new Solution0402();
    System.out.println(user.solution(A, 1));

  }
}


class Solution0402 {

  public int solution(int[] A, int K) {
    List<Integer> list = new ArrayList<>();
    List<String> result = new ArrayList<>();
//    A배열을 추가하는 list
//    두 숫자를 뽑아 조합을 추가하는 result

    for (int num : A) {
      list.add(num);
    }
    Collections.sort(list, Collections.reverseOrder());
//    A배열을 list에 추가, 내림차순으로 정렬한다.

    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size(); j++) {
        if(i==j){
          j++;
        }
//        한카드를 동시에 뽑을수 없기떄문에 제외한다.
        if(i==list.size()-1&& j==list.size()){
          break;
        }
//        마지막은 제외한다.
        String num = "";
        num += Integer.toString(list.get(i));
        num += Integer.toString(list.get(j));
        result.add(num);

      }
    }
//    list에 있는 숫자들을 출력하여 문자열로 변환한뒤 순서대로 result에 저장

    System.out.println("뽑을수 있는 모든 조합의 수 : \n"+result);
    return Integer.parseInt(result.get(K - 1));
  }
}