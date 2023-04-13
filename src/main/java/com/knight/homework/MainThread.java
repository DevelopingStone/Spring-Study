package com.knight.homework;

class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("MyThread: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class MainThread {
  public static void main(String[] args) {
    MyThread thread = new MyThread();
    thread.start();

    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread: " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

