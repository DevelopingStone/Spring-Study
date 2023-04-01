package com.knight.zerobase;

public class JavaStudy01 {

  public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {

        String output = String.format("0%d x 0%d = %02d", i, j, i * j);
        System.out.println(output);

      }
    }
  }

}
