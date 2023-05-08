package com.knight.oop;

public class IsA {

}

class Animal {

  private String name;

  public Animal() {
  }

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void eat() {
    this.test();
    System.out.println(name + " is eating.");
  }

  public void test(){
    System.out.println("테스트입니다.");
  }
}

class Dog extends Animal{


  public Dog(String name) {
    super(name);
  }
  public void bark(){
    System.out.println(getName() + "is barking !");
  }
  public void eat() {
    super.eat();
    System.out.println("리트리버는 잘 안먹습니다.");
  }

  public static void main(String[] args) {
    Dog dog = new Dog("리트리버");
    dog.eat();


  }



}
