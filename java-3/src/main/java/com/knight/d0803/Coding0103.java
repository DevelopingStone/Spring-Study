package com.knight.d0803;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Coding0103 {
    public static void main(String[] args) {
        new Solution0103().solution(new String[]{"hello", "hear", "hell", "good", "goose", "children", "card", "teachable"},
                new String[]{"he??", "g???", "childre?", "goo????", "?"});

        String a = "he??";


    }
}


class Solution0103 {
    public List<List<String>> solution(String[] words, String[] queries) {
        List<List<String>> resultList = new ArrayList<>();

        for (String qu : queries) {
            List<String> list = new ArrayList<>();
            int num = (int) qu.chars().filter(ch -> ch == '?').count();
            String a = qu.replaceAll("\\?", "");

            for (String wo : words) {
                if (wo.startsWith(a) && wo.length() == a.length() + num) {
                    list.add(wo);
                }
            }
            resultList.add(list);
        }

        return resultList;
    }
}
