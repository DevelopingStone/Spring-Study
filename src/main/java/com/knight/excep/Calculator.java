package com.knight.excep;

public class Calculator {

  public int plus(int a, int b) throws Exception_Knight {
    int result = a + b;
    if (result > 200) {
      throw new Exception_Knight();
    }

    return a + b;

  }

  public int subtract(int a, int b) throws Exception_Knight {
    int result = a - b;
    if (result < 0) {
      throw new Exception_Knight();
    }
    return a - b;

  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public double divide(double a, double b) {
    return a / b;


  }


}
