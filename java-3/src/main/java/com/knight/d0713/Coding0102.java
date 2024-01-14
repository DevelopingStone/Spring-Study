package com.knight.d0713;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Coding0102 {
    public static void main(String[] args) {
        String[] names = {"제로", "베이스", "자바", "스쿨", "자바", "베이스", "베이스", "백엔드", "화이팅"};

        System.out.println(new Solution0102().solution(names));
    }
}


class Solution0102 {
    public int solution(String[] names) {
        Set<String> setNames = new LinkedHashSet<>(Arrays.asList(names));
        return (setNames.size()) * (setNames.size() - 1) * (setNames.size() - 2) * (setNames.size() - 3) / (4 * 3 * 2 * 1);
    }
}