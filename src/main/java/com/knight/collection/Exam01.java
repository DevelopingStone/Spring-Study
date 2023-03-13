package com.knight.collection;

public class Exam01 {

  public static void main(String[] args) {

    ListExam list = new ListExam();
    list.add(3);
    list.add(5);
    int size1 = list.size();
    System.out.println(size1);
    list.clear();
    int size2 = list.size();
    System.out.println(size2);
    list.add(7);
    list.add(7);
    int num = list.get(0);
    System.out.println(num);
    num = list.get(1);
    System.out.println(num);


  }

}
