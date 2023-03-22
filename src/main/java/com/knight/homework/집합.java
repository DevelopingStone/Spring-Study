package com.knight.homework;

import java.util.ArrayList;
import java.util.Collections;

public class 집합 {

  public static void main(String[] args) {

    MySet a = new MySet();
    a.add(1);
    a.add(1);
    System.out.println(a.list);
    a.add(2);
    a.add(3);
    System.out.println(a.list);

    a = new MySet(new int[]{1, 2, 3, 4, 5});

    MySet b = new MySet(new int[]{2, 4, 6, 8, 10});
    System.out.println("a.list = " + a.list);
    System.out.println("b.list = " + b.list);

    MySet result = a.retainAll(b);
    System.out.println("교집합 = " + result.list);

    result = a.addAll(b);
    System.out.println("합집합 = " + result.list);

    result = a.removeAll(b);
    System.out.println("차집합 = " + result.list);

  }


}

class MySet {

  ArrayList<Integer> list = new ArrayList<>();
  ;
  int[] array;

  public MySet() {

  }

  public MySet(int[] ints) {
    array = ints;
    for (int i = 0; i < array.length; i++) {
      list.add(array[i]);

    }
  }

  public void add(int list) {
    if (!this.list.contains(list)) {
      this.list.add(list);
    }


  }


  public MySet retainAll(MySet b) {
    MySet result = new MySet();
    for (int i : this.list) {
      for (int j : b.list) {
        if (i == j) {
          result.add(i);
        }
      }
    }

    return result;

  }

  public MySet addAll(MySet b) {
    MySet result = new MySet();
    for (int i : this.list) {
      for (int j : b.list) {
        if (i == j) {
          result.add(i);
        } else if (i != j) {
          result.add(i);
          result.add(j);

        }

      }
    }

    Collections.sort(result.list);

    return result;
  }

  public MySet removeAll(MySet b) {
    MySet result = new MySet();
    for (int i : this.list) {
      boolean flag = true;
      for (int j : b.list) {
        if (i == j) {
          flag = false;
          break;
        }


      }
      if (flag) {
        result.add(i);
      }

    }

    return result;
  }
}
