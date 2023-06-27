package com.knight.main;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Solution user = new Solution();


        int[] reserve = {4, 455, 6, 4, -1, 45, 6};
        System.out.println(user.solution("갸가가갸", "가"));


    }
}


class Solution {
    public boolean solution(String p, String s) {

        Map<String, Integer> pMap = new LinkedHashMap<>();
        Map<String, Integer> sMap = new LinkedHashMap<>();
        List<Integer> pList = new LinkedList<>();
        List<Integer> sList = new LinkedList<>();

        for (String word : p.split("")) {
            int pValue = pMap.getOrDefault(word, 0);
            pList.add(pValue + 1);
        }

        for (String word : s.split(" ")) {
            int sValue = sMap.getOrDefault(word, 0);
            sList.add(sValue + 1);
        }


        for (int i = 0; i < sList.size(); i++) {
            if (pList.get(i) != sList.get(i) || sList.size() != pList.size()) {
                return false;
            }
        }

        return true;

    }
}