package com.knight.d0704;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Pre0101 {
    public static void main(String[] args) {
        Solution0101 user = new Solution0101();
//        int[] arr = {1, 2, 4, 4, 4, 4, 2, 3, 3, 3};
        int[] arr = {1, 3, 5, 4, 3, 1, 1};
        System.out.println(user.solution(arr));
    }
}

class Solution0101 {
    public boolean solution(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> result = new LinkedList<>();
        for (int nums : arr) {

            int value = map.getOrDefault(nums, 0);
            map.put(nums, value + 1);

        }

        System.out.println(map);

        for (Map.Entry<Integer, Integer> maps : map.entrySet()) {

            if (result.contains(maps.getValue())) {

                return false;

            } else {
                result.add(maps.getValue());
            }

            System.out.println("result = " + result);

        }

        return true;
    }
}