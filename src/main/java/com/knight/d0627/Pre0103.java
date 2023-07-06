package com.knight.d0627;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Pre0103 {
    public static void main(String[] args) {
        Solution0103 user = new Solution0103();
        user.solution("가나다라", "바나나 드래곤 스리랑카 오염");

    }
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
        System.out.println("pList = " + pList);
        System.out.println("sList = " + sList);

        for (int i = 0; i < sList.size(); i++) {
            if (pList.get(i) != sList.get(i) || sList.size() != pList.size()) {
                return false;
            }
        }


        return true;

    }
}