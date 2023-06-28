package com.knight.june20;

import java.util.Stack;

public class Pre0112 {
    public static void main(String[] args) {
        Solution0112 user = new Solution0112();
        System.out.println(user.solution("(()){[<>]}"));
    }
}


class Solution0112 {
    public int solution(String S) {
        Stack<Integer> stack = new Stack<>();
        String front = "({[<";
        String back = ")}]>";


        for (String word : S.split("")) {
            if (!stack.isEmpty() && back.contains(word) && stack.peek() == back.indexOf(word)) {
                stack.pop();
            } else if (front.contains(word)) {
                stack.push(front.indexOf(word));
            }
        }
        if (stack.size() == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}