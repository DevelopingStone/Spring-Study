package com.knight.june20;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pre0114 {
    public static void main(String[] args) {
        Solution0114 user = new Solution0114();
        System.out.println(user.solution("+++++13+26-7"));
    }
}


class Solution0114 {
    public int solution(String s) {
        List<String> num = new LinkedList<>(Arrays.asList(s.split("[+-]+")));
        List<String> sign = new LinkedList<>(Arrays.asList(s.split("[0-9]+")));
        int sum = 0;

        if ("".equals(num.get(0))) {
            num.remove(0);
        }
        if ("".equals(sign.get(0))) {
            sign.remove(0);
            sign.add(0, "+");
        }


        System.out.println("num = " + num);
        System.out.println("sign = " + sign);

        for (int i = 0; i < num.size(); i++) {
            if ("-".equals(sign.get(i))) {
                sum -= Integer.parseInt(num.get(i));
            } else {
                sum += Integer.parseInt(num.get(i));
            }
        }
        return sum;
    }
}