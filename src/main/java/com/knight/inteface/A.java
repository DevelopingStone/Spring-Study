package com.knight.inteface;

public class A {

  private B b;
  private int total;

  A() {
    b = new B();
  }

  public void factory() {
    b.ready();

  }

  public void total() {
    this.total = b.total();
    System.out.println(total);
  }

}
