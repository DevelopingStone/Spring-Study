package com.knight.homework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
  private int count = 0;
  private Lock lock = new ReentrantLock();

  public void increment() {
//    lock.lock();
    try {
      // 동기화가 필요한 작업 수행
      count++;
    } finally {
//      lock.unlock();
    }
  }

  public int getCount() {
    return count;
  }
}




class MyThread extends Thread {
  private Counter counter;

  public MyThread(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++) {
      counter.increment();
    }
  }
}




class Main01 {
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();

    MyThread thread1 = new MyThread(counter);
    MyThread thread2 = new MyThread(counter);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("Final Count: " + counter.getCount());
  }
}

