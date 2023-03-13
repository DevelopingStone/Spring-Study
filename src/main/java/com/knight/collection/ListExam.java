package com.knight.collection;

public class ListExam {

  int[] list = new int[]{};
  int i = 0;

  public void add(int a) {
    list = new int[i + 1];
    list[i] = a;
    this.i++;

  }

  public void clear() {
    list = new int[]{};
    this.i = 0;
  }

  public int size() {
    return list.length;
  }

  public int get(int i) {
    return list[i];
  }
}
