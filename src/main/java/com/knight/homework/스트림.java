package com.knight.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class 스트림 {

  public static void main(String[] args) {

    String[] arr = {"a","b","c"};

    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));

//    for(int i =0; i<arr.length;i++){
//      System.out.print(arr[i]);
//      if(i!=arr.length-1){
//        System.out.print(",");
//      }
//    }
    
//    for(String j : arr){
//      System.out.println(j);
//    }

    Stream st01 = Arrays.stream(arr);
    st01.forEach(System.out::println);

    Stream st02 = list.stream();
    st02.forEach(System.out::println);



  }

}
