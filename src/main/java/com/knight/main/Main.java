package com.knight.main;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Solution user = new Solution();

        int[] list = {2, 4};
        int[] reserve = {0,1,1,6,6,7,7,7};
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(user.solution(reserve));




    }
}


class Solution {
    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            System.out.println("map = " + map);
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}