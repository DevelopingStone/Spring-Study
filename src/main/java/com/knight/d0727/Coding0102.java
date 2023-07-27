package com.knight.d0727;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Coding0102 {
    public static void main(String[] args) {
//        new Solution0102().solution(new int[]{9, 9, 5, 2, 1, 4, 6}, new int[]{1, 2, 6, 1, 0, 4, 4});
    }
}


class Solution0102 {
    public int solution(int[] numbers, int target) {
        Set<Integer> set = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        Set<Integer> historySet = new HashSet<>(Set.copyOf(set));

        if (set.contains(target)) {
            return 1;
        }

        for (int i = 2; i <= 10000; i++) {
            Set<Integer> newSet = new HashSet<>();
            set.forEach(x -> {
                for (int number : numbers) {
                    if (x + number <= target) {
                        newSet.add(x + number);
                    }
                    if (x * number <= target) {
                        newSet.add(x * number);
                    }
                }
            });

            newSet.removeAll(historySet);
            set = newSet;
            historySet.addAll(set);

            if (set.contains(target)) {
                return i;
            }
            if (set.size() == 0) {
                return -1;
            }
        }
        return -1;
    }
}