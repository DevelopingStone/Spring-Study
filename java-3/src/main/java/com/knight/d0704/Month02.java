package com.knight.d0704;

import java.util.Map;
import java.util.TreeMap;

public class Month02 {

    public static void main(String[] args) {
        int[] boss = {75,25,70,46,60,7,85};
        int[] skill = {65,28,78,29,37,63,89};
        Solution02 user = new Solution02();
        System.out.println(user.solution(5, boss, skill));


    }


}


class Solution02 {
    public int solution(int N, int[] boss, int[] skill) {
        int bossTmp = 0, skillTmp = 0, time = 0;
        TreeMap<Integer, Integer> speedRun = new TreeMap<>();
        for (int i = 0; i < boss.length; i++) {
            speedRun.put(skill[i], boss[i]);
        }


        System.out.println("speedRun = " + speedRun);

        while (!speedRun.isEmpty()) {
            for (Map.Entry<Integer, Integer> sr : speedRun.entrySet()) {


            }
        }

        return time;
    }
}