package com.knight.homework;


import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
//    int[][] array = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},
//        {1, 1, 1, 1, 1}};
    int[] array = {7, 3, 2, 13, 9, 15, 8, 11};
    System.out.println(user.solution(5, 555));


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

  public List<Integer> solution(int l, int r) {
    List<Integer> list = new LinkedList<>();
    for (int i = l; i <= r; i++) {
      if (Integer.toString(i).matches("[05]+")) {
        list.add(i);
      }
    }

    if (list.size() == 0) {
      list.add(-1);
    }
    return list;
  }
}