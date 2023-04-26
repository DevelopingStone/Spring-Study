package com.knight.zerobase.practice.two;

import java.util.ArrayList;
import java.util.List;

public class ThreeAnd0302 {

}


class Solution0302 {

  public List<Integer> solution(int[] nums) {
    List<Integer> list = new ArrayList<>();
//    nums 배열과 비교해줄 List 배열생성
    for (int i = 1; i <= nums.length; i++) {
      list.add(i);
    }
//    list 배열에 1 ~ nums.length 길이만큼 추가
    for (int i : nums) {
      if (list.contains(i)) {
        list.remove(Integer.valueOf(i));
      }
    }
//   nums 배열에서 있는 숫자들 list 배열에서 삭제 후 출력

    return list;
  }
}