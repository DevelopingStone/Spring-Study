package com.knight.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] progresses = {96, 94};
        int[] speeds = {3, 3};
        Solution user = new Solution();
        System.out.println(user.solution(progresses, speeds));

    }
}


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int[] pro = progresses.clone();
        int day = 0;
        int count = 0;

        for (int i = 0; i < progresses.length; i++) {

            if (i >= 1 && count >= 1 && pro[i] + (speeds[i] * day) < 100) {
                list.add(count);
                count = 0;
            }

            if (pro[i] + (speeds[i] * day) < 100) {
                while (pro[i] < 100) {
                    pro[i] += speeds[i];
                    day++;

                    if (pro[i] >= 100) {
                        count++;
                    }


                }
            } else {
                count++;
            }

        }
        list.add(count);


        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        System.out.println(list);


        return result;
    }
}