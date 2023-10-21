package com.knight.oop;

class Engine {
    public void start() {
        System.out.println("Engine is starting...");
    }

    public void stop() {
        System.out.println("Engine is stopping...");
    }

    public void 가속(){

    }
}

public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        System.out.println("Car is starting...");
        engine.start();
    }

    public void stop() {
        System.out.println("Car is stopping...");
        engine.stop();
    }
}


