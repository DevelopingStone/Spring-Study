package com.knight.homework;

import java.util.Arrays;
import java.util.HashSet;

public class Hash01 {

  public static void main(String[] args) {

    HashSet<Integer> set1 = new HashSet(Arrays.asList(1, 2, 3, 4));
    HashSet<Integer> set2 = new HashSet(Arrays.asList(2, 4, 6, 8));


        for(int i : set1){
          System.out.println(i);
        }

  }


}
