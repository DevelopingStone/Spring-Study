package com.knight.june02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution user = new Solution();
        String[] array = {"12", "123", "1235", "567", "88"};
        System.out.println(user.solution(array));
    }
}

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        for (String word : phone_book) {
            map.put(word, i);
            i++;
        }
        System.out.println(map);

        for (int j = 0; j < phone_book.length; j++) {
            for (int k = 1; k < phone_book[j].length(); k++) {
                if (map.containsKey(phone_book[j].substring(0, k))) {
                    return false;
                }
            }
        }


        return true;
    }
}