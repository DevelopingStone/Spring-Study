package com.knight.homework;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
//    int[][] array = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},
//        {1, 1, 1, 1, 1}};
    int[][] array = {{1, 4}, {9, 2}, {3, 8}, {-5, 10}};
    int[] value = {3, 3, 3, 2, 2, 2};
    String[] players = {"19", "67", "67"};
    int[][] num = {{5, 10}, {1, 8}, {0, 2}, {0, 3}, {2, 5}, {2, 6}, {10, 12}, {7, 12}};
    int[] food = {1, 3, 4, 6};
    System.out.println(user.solution("100", "203045"));
  }
}

/*
class Solution {

  public int solution(int[][] lines) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < lines.length; i++) {
      int min = Math.min(lines[i][0], lines[i][1]);
      System.out.println("min = " + min);
      int max = Math.max(lines[i][0], lines[i][1]);
      System.out.println("max = " + max);


      for(int j=min; j<max; j++){
        int value = map.getOrDefault(j,0);
        map.put(j,value+1);

      }




    }
    System.out.println("map = " + map);

    int answer = 0;
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
      if(entry.getValue()>=2){
        answer++;
      }
    }




    return answer;
  }
}*/
/*class Solution {
  int a = 0;
  int b = 0;
  public int solution(int[][] dots) {
    System.out.println(dots.length);
    System.out.println(dots[0].length);
    for (int i = 0; i <dots.length ; i++) {
      for (int j = i+1; j <dots[i].length ; j++) {
        int a = dots[i][j] - dots[i][i];
        int b = dots[j][j] - dots[i][j];



      }
    }



    return 0;
  }
}*/


class Solution {

  public String solution(String X, String Y) {
    List<String> y = new LinkedList<>(Arrays.asList(Y.split("")));
    List<Integer> num = new LinkedList<>();

    for (String xNum : X.split("")) {
      if (y.contains(xNum)) {
        y.remove(xNum);
        num.add(Integer.parseInt(xNum));
      }
    }

    if(num.size()==0){
      return "-1";
    }

    else if(num.get(0)==0&&num.get(1)==0){
      return "0";
    }



    Collections.sort(num, Collections.reverseOrder());
    String result = "";
    for (Integer numResult : num) {
      result += Integer.toString(numResult);
    }


      return result;

  }
}