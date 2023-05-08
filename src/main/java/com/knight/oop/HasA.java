package com.knight.oop;

public class HasA {

}

class Engine {

  public void sound() {
    System.out.println("부릉부릉");
  }
}


class Car {

  private Engine engine;

  public Car(Engine engine) {
    if (engine == null) {
      this.engine = new Engine();
    } else {
      this.engine = engine;
    }


  }

  public static void main(String[] args) {
    Engine engine = new Engine();
    Car car = new Car(engine);
    car.engine.sound();


  }


}