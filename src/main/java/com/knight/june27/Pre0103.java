package com.knight.june27;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Pre0103 {
}


class Solution0103 {
    public boolean solution(String p, String s) {
        Map<String, Integer> pMap = new LinkedHashMap<>();
        Map<String, Integer> sMap = new LinkedHashMap<>();
        List<Integer> pList = new LinkedList<>();
        List<Integer> sList = new LinkedList<>();

        for (String word : p.split("")) {
            int pValue = pMap.getOrDefault(word, 0);
            pMap.put(word, pValue + 1);
            pList.add(pValue + 1);
        }

        for (String word : s.split(" ")) {
            int sValue = sMap.getOrDefault(word, 0);
            sMap.put(word, sValue + 1);
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