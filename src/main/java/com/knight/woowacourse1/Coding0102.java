package com.knight.woowacourse1;

public class Coding0102 {
    public static void main(String[] args) {

        System.out.println(new solution0102().deduplication("browoanoommnaon"));
    }
}


class solution0102 {

    public String deduplication(String cryptogram) {
        StringBuilder result = new StringBuilder(cryptogram);


        for (int i = 0; i < result.length() - 1; i++) {
            for (int j = i + 1; j <= i + 1; j++) {

                if (result.charAt(i) == result.charAt(j)) {
                    result.delete(i, j + 1);
                    i -= 2;
                }
            }
        }

        return result.toString();
    }
}



