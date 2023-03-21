package com.knight.homework;

import java.util.Arrays;
import java.util.HashSet;

public class Exam0321 {

  public static void main(String[] args) {

    HashSet<Integer> set1 = new HashSet(Arrays.asList(1, 2, 3, 4));
    HashSet<Integer> set2 = new HashSet(Arrays.asList(2, 4, 6, 8));

    set1.retainAll(set2);
    System.out.println("set1 = " + set1);
    set1.addAll(set2);
    System.out.println("set1 = " + set1);

    set1.removeAll(set2);
    System.out.println("set1 = " + set1);


  }


}
