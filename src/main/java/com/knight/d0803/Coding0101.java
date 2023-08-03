package com.knight.d0803;

import java.util.LinkedList;
import java.util.List;

public class Coding0101 {
    public static void main(String[] args) {

        String[] titles = {"아모르파티", "아기상어", "올챙이와개구리", "산다는건"};
        String[] lyrics = {"산다는게", "아기상어", "개울가", "산다는건"};
        String[] problems = {"산다", "아기상어", "올챙이"};
        Solution0101 solution0101 = new Solution0101();
        System.out.println(solution0101.solution(titles, lyrics, problems));


    }
}

class Solution0101 {
    public List<List<String>> solution(String[] titles, String[] lyrics, String[] problems) {
        List<List<String>> resultList = new LinkedList<>();

        for (String pro : problems) {
            List<String> list = new LinkedList<>();

            for (int i = 0; i < lyrics.length; i++) {
                if (lyrics[i].startsWith(pro)) {
                    list.add(titles[i]);
                }
            }

            resultList.add(list);
        }

        return resultList;
    }
}
