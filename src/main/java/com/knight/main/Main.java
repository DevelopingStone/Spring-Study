package com.knight.main;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Solution user = new Solution();
        String move = "DDDRRRDDLL";
        user.solution(move);

    }
}

//        String[] park = {"OSO", "OOO", "OXO", "OOO"};
//        String[] routes = {"E 2", "S 3", "W 1"};
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
/*class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                if (!skip.contains(String.valueOf(temp))) {
                    idx++;
                }
            }
            answer.append(temp);
        }

        return answer.toString();
    }
}*/


class Solution {
    public int[] solution(String move) {
        int[] result = {0, 0};
        int[] xP = {-1, 0, 1, 0};
        int[] yP = {0, 1, 0, -1};

        for (String mv : move.split("")) {
            int index = "URDL".indexOf(mv);
            result[0] += xP[index];
            result[1] += yP[index];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}

