package com.knight.inteface;

public class C implements Inter{

  @Override
  public int total() {
    return 100;
  }

  @Override
  public void ready() {

    System.out.println("새로운 메소드 B");

  }
}
