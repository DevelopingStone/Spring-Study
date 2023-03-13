package com.knight.inteface;

public class A {

  private Inter inter;


  public void setInter(Inter inter) {
    this.inter = inter;

    System.out.println("inter = " + inter);
  }

  public void print(Inter inter) {
    int total = inter.total();

    System.out.println("total = " + total);

  }


}
