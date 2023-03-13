package com.knight.generic;

public class Exam01 {

  public static void main(String[] args) {
    MyClass<Integer> myClass = new MyClass<>();
    myClass.setValue(1);
    Integer value = myClass.getValue();
    System.out.println(value);
  }


}
class MyClass<T> {
  private T value;

  public void setValue(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }
}

