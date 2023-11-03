package com.knight.main;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> intStream = list.stream();
//        intStream.forEach(System.out::print);
//        System.out.println();
//
//        intStream = list.stream();
//        intStream.forEach(System.out::print);
//        System.out.println();

        Stream<String> strStream = Stream.of("a", "b", "c","d");
        strStream.forEach(System.out::println);


    }
}



