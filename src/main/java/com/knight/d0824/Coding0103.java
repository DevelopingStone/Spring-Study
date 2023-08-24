package com.knight.d0824;

import java.util.ArrayList;
import java.util.List;

public class Coding0103 {
    public static void main(String[] args) {

        System.out.println(new Solution0103().solution("2552552551"));


    }
}


class Solution0103 {
    public List<String> result = new ArrayList<>();

    public void makeIP(String s, List<String> parts, int startIndex) {
        if (parts.size() == 4) {
            if (startIndex == s.length()) {
                result.add(String.join(".", parts));
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (startIndex + i > s.length()) {
                break;
            }

            String part = s.substring(startIndex, startIndex + i);
            if (isCorrectNum(part)) {
                parts.add(part);
                makeIP(s, parts, startIndex + i);
                parts.remove(parts.size() - 1);
            }
        }
    }

    public boolean isCorrectNum(String part) {
        if (part.length() > 1 && part.charAt(0) == '0') {
            return false;
        }

        int num = Integer.parseInt(part);
        return num >= 0 && num <= 255;
    }

    public String[] solution(String s) {
        makeIP(s, new ArrayList<>(), 0);
        return result.toArray(new String[0]);
    }
}