package com.knight.inteface;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args)
      throws Exception {
    String fileName = "src/main/java/com/knight/inteface/setting.txt";

    BufferedReader br = new BufferedReader(new FileReader(fileName));
    System.out.println(br);
    String line = br.readLine();
    System.out.println(line);
    Class clazz = Class.forName(line);
    A a = new A();
    Inter inter = (Inter)clazz.newInstance();
    a.print(inter);




  }

}
