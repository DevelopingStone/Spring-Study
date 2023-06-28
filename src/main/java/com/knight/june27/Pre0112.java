package com.knight.june27;

import java.util.LinkedList;
import java.util.List;

public class Pre0112 {
    public static void main(String[] args) {
        Solution0112 user = new Solution0112();
//        System.out.println(user.solution("(()){[<>]}"));
    }
}


class Solution0112 {
    public List<Integer> solution(int[] nums) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> result = new LinkedList<>();

        for (int i = 1; i <= nums.length; i++) {
            list1.add(i);
        }
        for (int num : nums) {
            list2.add(num);
        }

        for (int num : list1) {
            if (!list2.contains(num)) {
                result.add(num);
            }

        }
        return result;
    }
}