package com.knight.d0720;

import java.util.LinkedList;
import java.util.List;

public class Coding0102 {
    public static void main(String[] args) {
        new Solution0102().solution(new int[]{9, 9, 5, 2, 1, 4, 6}, new int[]{1, 2, 6, 1, 0, 4, 4});
    }
}


class Solution0102 {
    public List<Integer> solution(int[] a, int[] b) {
        List<Integer> aList = new LinkedList<>();
        List<Integer> bList = new LinkedList<>();
        List<Integer> result = new LinkedList<>();

        for (int num : a) {
            aList.add(num);
        }
        for (int num : b) {
            bList.add(num);
        }

        if (aList.size() > bList.size()) {
            int index = aList.size() - bList.size();
            for (int i = 0; i < index; i++) {
                bList.add(0, 0);
            }
        } else if (aList.size() < bList.size()) {
            int index = bList.size() - aList.size();
            for (int i = 0; i < index; i++) {
                aList.add(0, 0);
            }

        }
        int lift = 0;
        for (int i = aList.size() - 1; i >= 0; i--) {
            int num = aList.get(i) + bList.get(i) + lift;
            lift = 0;

            if (num >= 10) {
                lift = 1;
                num = num - 10;
                result.add(0, num);
            } else {
                result.add(0, num);
            }
        }
        if (lift == 1) {
            result.add(0, 1);
        }


        return result;
    }
}