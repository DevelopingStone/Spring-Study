package com.knight.oop;

import java.io.*;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
//    String filename = "C:/Intellij-23-02/JavaProject/src/main/java/com/knight/oop/test.txt";
//
//
//    try {
//      // 파일 읽기
//      FileReader reader = new FileReader(filename);
//      BufferedReader br = new BufferedReader(reader);
//      String line;
//      while ((line = br.readLine()) != null) {
//        System.out.println(line);
//      }
//      br.close();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    String str = "+3-4+4";
    String [] str1 = str.split(" ");
    System.out.println(Arrays.toString(str1));
  }
}





