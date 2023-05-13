package com.knight.homework;


import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
    int[][] arr = {{-3, -1}, {-2, 3}, {2, 3}};
    System.out.println(user.solution(arr));
  }


}


class Solution {

  public int solution(int[][] lines) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    Set<Integer> set3 = new HashSet<>();
    Set<Integer> result = new LinkedHashSet<>();
    Set<Integer> result1 = new LinkedHashSet<>();
    Set<Integer> result2 = new LinkedHashSet<>();
    for (int i = lines[0][0]; i <= lines[0][1]; i++) {
      set1.add(i);


    }
    for (int i = lines[1][0]; i <= lines[1][1]; i++) {
      set2.add(i);


    }

    for (int i = lines[2][0]; i <= lines[2][1]; i++) {
      set3.add(i);


    }

    System.out.println("set1 = " + set1);
    System.out.println("set1 = " + set2);
    System.out.println("set1 = " + set3);



    for(int num : set1){
      if(set2.contains(num)){
        result.add(num);
      }
    }
//    if(result.size()==1){
//      result.clear();
//    }
    for(int num : set1){
      if(set3.contains(num)&&!result.contains(num)){
        result1.add(num);
      }
    }
//    if(result1.size()==1){
//      result1.clear();
//    }
    for(int num : set2){
      if(set3.contains(num)&&!result.contains(num)&&!result1.contains(num)){
        result2.add(num);
      }
    }
//    if(result2.size()==1){
//      result2.clear();
//    }

    int sum = 0;
    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
    if(result.size()==0 || result.size()==1){

    }
    else{
      sum+=result.size()-1;
    }

    if(result1.size()==0 || result1.size()==1){

    }
    else{
      sum+=result1.size()-1;
    }

    if(result2.size()==0 || result2.size()==1){

    }
    else{
      sum+=result2.size()-1;
    }


    return sum;
  }
}

