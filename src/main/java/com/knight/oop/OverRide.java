package com.knight.oop;

public class OverRide {


}

class Animal {

  public void makeSound() {
    System.out.println("동물이 소리를 냅니다.");
  }
}

class Dog extends Animal {

  @Override
  public void makeSound() {
    System.out.println("멍멍!");
  }
}

class Cat extends Animal {

  @Override
  public void makeSound() {
    System.out.println("야옹~");
  }
}

class Main {

  public static void main(String[] args) {
    Animal animal1 = new Animal();
    animal1.makeSound();  // 출력 결과: "동물이 소리를 냅니다."

    Dog dog1 = new Dog();
    dog1.makeSound();  // 출력 결과: "멍멍!"

    Cat cat1 = new Cat();
    cat1.makeSound();  // 출력 결과: "야옹~"
  }
}



