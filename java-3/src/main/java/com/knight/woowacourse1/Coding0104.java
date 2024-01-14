package com.knight.woowacourse1;

public class Coding0104 {


    public static void main(String[] args) {

        System.out.println(new solution0104().reverseMomWord("I love you"));







    }
}


class solution0104 {

    public String reverseMomWord(String word) {
        StringBuilder result = new StringBuilder();

        char[] sonWord = "ZYXWVUTSRQPONMLKJIHGFEDCBA".toCharArray();

        for (char c : word.toCharArray()) {

            if (Character.isUpperCase(c)) {
                int index = c - 'A';
                result.append(sonWord[index]);

            } else if (Character.isLowerCase(c)) {

                int index = c - 'a';
                result.append(Character.toLowerCase(sonWord[index]));

            } else {
                result.append(c);

            }

        }


        return result.toString();


    }


}
