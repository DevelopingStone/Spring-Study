package com.knight.exce.Excep;

public class Aclass {

  public int plus(int a, int b) throws Number  {
    int sum = a + b;
    if (sum < 0) {
      throw new Number();

    } else {
      return sum;
    }

  }


}
