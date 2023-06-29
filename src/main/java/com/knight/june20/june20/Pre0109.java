package com.knight.june20.june20;

import java.util.LinkedList;
import java.util.List;

public class Pre0109 {
}


class Solution0109 {
    public int solution(int[] orders, int n) {
        List<Integer> list = new LinkedList<>();
        int cancel[] = new int[orders[orders.length - 1] - orders.length];

        for (int num : orders) {
            list.add(num);
        }

        int arrayNum = 0;
        for (int i = 1; i <= orders[orders.length - 1]; i++) {
            if (!list.contains(i)) {
                cancel[arrayNum++] = i;
            }
        }
        return cancel[n - 1];
    }
}