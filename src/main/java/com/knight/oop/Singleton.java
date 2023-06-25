package com.knight.oop;

public class Singleton {
    private static Singleton instance;
    int count = 0;

    private Singleton() {
        // private 생성자
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        count++;
    }
}

class MainSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.doSomething();
        System.out.println(singleton1.count);


        Singleton singleton2 = Singleton.getInstance();
        singleton2.doSomething();
        System.out.println(singleton2.count);

        System.out.println(singleton1 == singleton2);


    }
}

