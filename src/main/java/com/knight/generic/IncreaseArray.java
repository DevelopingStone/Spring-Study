package com.knight.generic;

public class IncreaseArray<T> {

  private Integer[] exam1 = new Integer[3];
  private Integer[] exam2;
  private int current = 0;
  private int capacity = 10;
  private int amount = 0;

  public <T> void add(T a) {
    if (exam1.length <= current) {
      System.out.println("exam1 배열 확장하겠습니다. 현재사이즈는  : " + exam1.length + "입니다.");
      exam2 = new Integer[exam1.length];
      for (int i = 0; i < exam1.length; i++) {

        exam2[i] = exam1[i];
      }
      exam1 = new Integer[exam1.length + capacity];
      System.out.println("exam1 배열 확장했습니다. 현재사이즈는  : " + exam1.length + "입니다.");
      for (int i = 0; i < exam2.length; i++) {
        exam1[i] = exam2[i];
      }
      exam1[current] = (Integer) a;

    } else {
      exam1[current] = (Integer) a;
      current++;
    }
  }

  public void get(int a) {
    System.out.println(exam1[a]);

  }

  public <T> void clear() {

  }

  public <T> void amount() {

  }

  public void all() {
    for (int i = 0; i < current; i++) {
      System.out.print(exam1[i]);
      if (i + 1 != current) {
        System.out.print(",");
      }
    }


  }

}
