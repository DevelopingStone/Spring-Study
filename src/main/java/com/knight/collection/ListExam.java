package com.knight.collection;

public class ListExam <T>{

  Object[] list = new Object[]{};
  int i = 0;

  public <T>void add(Object a) {
    list = new Object[i + 1];
    list[i] = a;
    i++;

  }

  public void clear() {
    list = new Object[]{};
    this.i = 0;
  }

  public <T> Object size() {
    return list.length;
  }

  public <T> Object get(int i) {

    return list[i];
  }

  public <T> void print(T[] arr){
    for(T i : arr){
      System.out.println(i);
    }



  }
}
