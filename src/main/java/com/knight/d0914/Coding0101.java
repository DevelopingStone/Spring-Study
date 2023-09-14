package com.knight.d0914;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Coding0101 {
    public static void main(String[] args) {


        System.out.println(new Solution0101().solution(132));


    }
}

class Solution0101 {
    public String[] solution(int n) {
        char[] arr = Integer.toString(n).toCharArray();
        Number number = new Number();

        List<String> list = new ArrayList<>();
        int idx = 0;
        while (idx++ < 5) {
            StringBuilder sb = new StringBuilder();
            int space = 1;
            for (char num : arr) {
                sb.append(number.matchNumber(num-'0', idx-1));
                if (space < arr.length) {
                    sb.append(" ");
                }
                space++;
            }
            String str = sb.toString();
            list.add(str);
        }
        return list.toArray(new String[5]);
    }

    static class Number {
        String[] zero = {"#####", "#---#", "#---#", "#---#", "#####"};
        String[] one = {"--#--", "--#--", "--#--", "--#--", "--#--"};
        String[] two = {"####", "---#", "####", "#---", "####"};
        String[] three = {"####", "---#", "####", "---#", "####"};
        String[] four = {"#---#", "#---#", "#####", "----#", "----#"};
        String[] five = {"#####", "#----", "#####", "----#", "#####"};
        String[] six = {"#####", "#----", "#####", "#---#", "#####"};
        String[] seven = {"#####", "----#", "----#", "----#", "----#"};
        String[] eight = {"#####", "#---#", "#####", "#---#", "#####"};
        String[] nine = {"#####", "#---#", "#####", "----#", "----#"};

        public String matchNumber(int num, int idx) {
            switch (num) {
                case 0: return zero[idx];
                case 1: return one[idx];
                case 2: return two[idx];
                case 3: return three[idx];
                case 4: return four[idx];
                case 5: return five[idx];
                case 6: return six[idx];
                case 7: return seven[idx];
                case 8: return eight[idx];
                case 9: return nine[idx];
            }
            return "";
        }
    }
}
