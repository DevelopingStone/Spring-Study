package com.knight.homework;


import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
    String[] str = {"aya", "yee", "u", "maa", "wyeoo"};
    String[] str1 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
    System.out.println(user.solution(str1));


  }


}


class Solution {

  public int solution(String[] babbling) {
    int count = 0;
    String[] voice = {"aya", "ye", "woo", "ma"};
    for (int i = 0; i < babbling.length; i++) {
      for (String word : voice) {
        babbling[i] = babbling[i].replace(word, "1");
      }

    }
    System.out.println(Arrays.toString(babbling));
    for(int i =0; i< babbling.length; i++){
      babbling[i]=babbling[i].replace("1","");
    }
    for(String word : babbling){
      if("".equals(word)){
        count++;
      }
    }


    return count;
  }
}