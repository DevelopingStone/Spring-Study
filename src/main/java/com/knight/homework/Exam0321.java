package com.knight.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Exam0321 {

  public static void main(String[] args) {
    HashSet<Integer> set1 = new HashSet<>();

    set1.add(1);
    set1.add(1);
    set1.add(1);
    System.out.println(set1);

    set1.add(1);
    set1.add(2);
    set1.add(3);
    System.out.println(set1);

    System.out.println(set1.contains(2));

    HashSet<Integer> set2 = new HashSet<>();

    HashSet a = new HashSet(Arrays.asList(1,2,3,4,5));
    HashSet b = new HashSet(Arrays.asList(2,4,5,7,10));
    a.retainAll(b);
    System.out.println(a);

    List<Integer> list = Arrays.asList(2, 4, 5, 7, 10);
    System.out.println("list = " + list);
    List<Integer> arrayList = new ArrayList<>(list);
    System.out.println("arrayList = " + arrayList);
    arrayList.add(3);
    System.out.println("arrayList = " + arrayList);
    arrayList.add(8);
    System.out.println("arrayList = " + arrayList);


  }


}
