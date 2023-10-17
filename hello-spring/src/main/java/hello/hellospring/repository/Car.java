package hello.hellospring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

//    public Car() {
//        this.engine = new Engine();
//    }

    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car is starting...");
        engine.start();
    }
}

@Component
class Engine {
    public void start() {
        System.out.println("Engine is starting...");
    }
}