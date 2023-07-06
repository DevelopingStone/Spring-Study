package com.knight.d0627;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Pre0109 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        Solution0109 user = new Solution0109();
        System.out.println(user.solution(arr));
    }
}


class Solution0109 {
    public int solution(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
            }
        }

        if (set.size() == 0) {
            return 0;
        }
        List<Integer> result = new LinkedList<>(set);
        return result.get(0);
    }
}