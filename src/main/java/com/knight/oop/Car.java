package com.knight.oop;


// 역할: Driver
class Driver {
    // 책임: drive
    public void drive(Car car) {
        car.start();
        car.accelerate();
    }
}

// 역할: Car
public class Car {

    // 책임: start
    public void start() {
        System.out.println("차가 시동이 걸립니다.");
    }
    // 책임: accelerate
    public void accelerate() {
        System.out.println("차가 가속합니다.");
    }
}

// 협력: 운전자와 차가 협력하여 주행하는 예시
class Main {
    public static void main(String[] args) {
        // 역할과 책임의 협력
        Driver driver = new Driver();
        Car car = new Car();

        // 운전자가 차를 운전하도록 협력
        driver.drive(car);
    }
}