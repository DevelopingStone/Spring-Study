package com.knight.d0704;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Pre0107 {

    public static void main(String[] args) {


        Solution0106 user = new Solution0106();

    }
}


class Solution0107 {
    public List<Integer> solution(int[] arr1, int[] arr2) {
        List<Integer> resultList = new LinkedList<>();
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    resultList.add(num1);
                }

            }
        }


        Collections.sort(resultList);
        return resultList;
    }
}