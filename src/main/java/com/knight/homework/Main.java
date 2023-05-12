package com.knight.homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {2, 4, 8};
    int[][] arr = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0},
        {0, 0, 0, 0, 0}};

    System.out.println(user.solution("x + 10 + 9x + 20x"));

    String [] str = {"a","b","c"};
    List<String> list = Arrays.asList(str.clone());



  }


}


class Solution {
  public String solution(String polynomial) {
    int numX = 0;
    int num = 0;
    for (String word : polynomial.split(" ")) {


      if(word.contains("x")){
        for(int i =0; i<word.length(); i++){
          if(word.charAt(i)!='x'){
            System.out.println("word.charAt(i) = " + word.charAt(i));

            numX+=Integer.parseInt(String.valueOf(word.charAt(i)));
            numX--;
          }
          else if (word.charAt(i)=='x'){
            numX++;
          }

        }




      }
      else if(word.matches("[0-9]+")){

        num+=Integer.parseInt(word);
      }
    }
    System.out.println(num);
    System.out.println(numX);


    return null;
  }
}