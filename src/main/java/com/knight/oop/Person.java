package com.knight.oop;

public class Person {

  //field
  private Car car;  // Car 클래스를 포함하는 멤버 변수

  //constructor
  public Person(Car car) {
    this.car = car;
  }
  //method


  //main
  public static void main(String[] args) {

    Car myCar = new Car("Hyundai", "Sonata");
    Person me = new Person(myCar);
    System.out.println(me.car.getModel()); // "Hyundai" 출력
  }

}








