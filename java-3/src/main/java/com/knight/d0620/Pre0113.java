package com.knight.d0620;

import java.util.LinkedList;
import java.util.List;

public class Pre0113 {
    public static void main(String[] args) {
        Solution0113 user = new Solution0113();
        System.out.println(user.solution("ABBA"));
    }


}

class Solution0113 {
    public int solution(String s) {
        List<String> list = new LinkedList<>();

        for (String word : s.split("")) {
            if (list.contains(word)) {
                list.remove(word);
            } else {
                list.add(word);
            }
        }
        if (list.size() == 0) {
            return 1;
        } else {
            return 0;
        }

    }
}