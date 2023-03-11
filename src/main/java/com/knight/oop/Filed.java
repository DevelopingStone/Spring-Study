package com.knight.oop;

interface Engine {

  void start();
}

public class Filed {

  public static void main(String[] args) {

    Car car = new Car(new GasolineEngine());
    car.start();

  }
}

class Car {

  private Engine engine;

  public Car(Engine engine) {
    this.engine = engine;
  }

  public void start() {
    engine.start();
  }
}

class GasolineEngine implements Engine {

  @Override
  public void start() {
    System.out.println("Gasoline engine started.");
  }
}

class ElectricEngine implements Engine {

  @Override
  public void start() {
    System.out.println("Electric engine started.");
  }
}
