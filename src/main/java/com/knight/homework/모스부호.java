package com.knight.homework;

import java.util.HashMap;
import java.util.Map;

public class 모스부호 {

  public static void main(String[] args) {

    String s = ".... . .-.. .-.. ---";
    Solution02 user = new Solution02();
    System.out.println(user.solution(s));

  }

}


class Solution02 {

  public String solution(String letter) {
    String str = "";
    Map<String, String> map = new HashMap<>();
    map.put(".-", "a");
    map.put("-...", "b");
    map.put("-.-.", "c");
    map.put("-..", "d");
    map.put(".", "e");
    map.put("..-.", "f");
    map.put("--.", "g");
    map.put("....", "h");
    map.put("..", "i");
    map.put(".---", "j");
    map.put("-.-", "k");
    map.put(".-..", "l");
    map.put("--", "m");
    map.put("-.", "n");
    map.put("---", "o");
    map.put(".--.", "p");
    map.put("--.-", "q");
    map.put(".-.", "r");
    map.put("...", "s");
    map.put("-", "t");
    map.put("..-", "u");
    map.put("...-", "v");
    map.put(".--", "w");
    map.put("-..-", "x");
    map.put("-.--", "y");
    map.put("--..", "z");

//    for (String key : map.keySet()) {
//      letter = letter.replace(key, map.get(key).toString());
//
//    }
//
//    return letter;
    for (String morse : letter.split(" ")) {
      String decodedChar = map.get(morse);
      str += decodedChar == null ? "" : decodedChar;
    }

    return str;


  }
}