package com.knight.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Homework01 {

  public static void main(String[] args) {

    List<String> list01 = new ArrayList(Arrays.asList("김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수"));


    List<String> stream01 = list01.stream()
        .filter(name -> name.startsWith("이"))
        .collect(Collectors.toList());

    System.out.println("이씨성을 가진 사람"+stream01);
    System.out.println(stream01.size());

  }

}
