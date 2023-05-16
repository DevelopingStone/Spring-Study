package com.knight.homework;


class Counter implements Runnable {
  private int count = 0;

  @Override
  public void run() {
    for (int i = 0; i < 1000000; i++) {
      count++; // count 값을 1 증가
    }
  }

  public int getCount() {
    return count;
  }
}

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();

    Thread thread1 = new Thread(counter);
    Thread thread2 = new Thread(counter);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("Count: " + counter.getCount());
  }
}
