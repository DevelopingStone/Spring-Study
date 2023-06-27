package com.knight.june27;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Pre0105 {
    public static void main(String[] args) {
        Solution0105 user = new Solution0105();
//        System.out.println(user.solution("1101"));
    }
}


class Solution0105 {
    public List<Integer> solution(int[] arr1, int[] arr2) {
        List<Integer> list = new LinkedList<>();
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    list.add(num1);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}