package com.knight.zerobase.practice.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiveAnd0501 {

  public static void main(String[] args) {
    Solution0501 user = new Solution0501();

    System.out.println(user.solution("Hello every world", "every"));
  }

}

class Solution0501 {

  public int solution(String sentence, String word) {
    List<String> list = new ArrayList<>(Arrays.asList(sentence.split(" ")));
//    sentence 단어를 나누고 추가해줄 list

    for (int i = 0; i < list.size(); i++) {
      if (word.equals(list.get(i))) {
        return i;
      }
    }
//    list에 넣은 단어를 출력하고 word에 넣는 단어와 동일할경우 return i 아닌경우 return -1

    return -1;


  }
}



