package com.knight.homework;

public class ThreadVsProcess {
  public static void main(String[] args) {
    // 프로세스의 메인 스택 영역
    int mainStackVariable = 10;
    System.out.println("프로세스 메인 스택 변수: " + mainStackVariable);

    // 스레드 생성
    Thread thread = new Thread(new Runnable() {
      public void run() {
        // 스레드에서 실행될 코드

        int thread = 20;
        System.out.println("스레드에서 실행되는 코드: " + thread);
        threadMethod();
      }
    });

    // 스레드 시작
    thread.start();
  }

  // 스레드에서 실행되는 메서드
  public static void threadMethod() {
    // 스레드 메서드의 스택 영역
    int threadMethodStackVariable = 30;
    System.out.println("스레드 메서드 스택 변수: " + threadMethodStackVariable);
  }
}
