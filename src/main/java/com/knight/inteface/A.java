package com.knight.inteface;

public class A implements Inter{
private Inter inter;


public A(){
//  this.inter = inter;
}
  public void setInter(Inter inter) {
    this.inter = inter;
  }

  @Override
  public int total() {
    return 30;
  }

  @Override
  public void ready() {

  }

/*  private B b;
  private Inter inter;

  A() {
    b = new B();
  }

  public void factory() {
    inter.ready();

  }

  public void total() {
    this.total = inter.total();
    System.out.println(total);
  }*/



}
