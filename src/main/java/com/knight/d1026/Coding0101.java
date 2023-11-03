package com.knight.d1026;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


class Solution0101 {
    public List<Integer> solution(int[] nums, int k) {
        Map<Integer, Integer> numberCount = new HashMap<>();
        List<Integer> result = new LinkedList<>();
        boolean startOrClose = true;

        putInMap(nums, numberCount);
        int largeNumber = findLargeNumberInTheMap(numberCount);

        while (startOrClose) {
            startOrClose = findNumber(k, numberCount, largeNumber, result, startOrClose);
            largeNumber--;
        }

        return result;
    }

    private boolean findNumber(int k, Map<Integer, Integer> numberCount, int largeNumber, List<Integer> result,
                               boolean startOrClose) {
        for (Map.Entry<Integer, Integer> findingNumber : numberCount.entrySet()) {
            if (findingNumber.getValue() == largeNumber) {
                result.add(findingNumber.getKey());
                if (result.size() == k) {
                    startOrClose = false;
                    break;
                }
            }

        }
        return startOrClose;
    }

    private int findLargeNumberInTheMap(Map<Integer, Integer> numberCount) {
        int largeNumber = 0;
        for (Map.Entry<Integer, Integer> tourOfValues : numberCount.entrySet()) {
            if (tourOfValues.getValue() > largeNumber) {
                largeNumber = tourOfValues.getValue();
            }
        }
        return largeNumber;
    }

    public void putInMap(int[] nums, Map<Integer, Integer> numberCount) {
        for (int ArrayNum : nums) {
            int num = numberCount.getOrDefault(ArrayNum, 0);
            numberCount.put(ArrayNum, num + 1);
        }
    }

}
