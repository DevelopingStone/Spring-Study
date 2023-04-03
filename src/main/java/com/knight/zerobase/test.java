package com.knight.zerobase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

  public static void main(String[] args) {

    List<List<Integer>> list = new ArrayList<>();
    List<Integer> list01 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    List<Integer> list02 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
    List<Integer> list03 = new ArrayList<>(Arrays.asList(11,12,13,14,15));
    List<Integer> list04 = new ArrayList<>(Arrays.asList(16,17,18,19,20));

    list.add(list01);
    list.add(list02);
    list.add(list03);
    System.out.println(list.get(0));
    


  }

}
