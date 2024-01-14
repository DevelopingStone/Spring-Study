package com.knight.d0727;

import java.util.Stack;

public class Coding0103 {
    public static void main(String[] args) {
        new Solution0103().solution("5{he2{l}o}friend");
    }
}


class Solution0103 {
    public String solution(String code) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        int repeatNum = 0;

        for (char c : code.toCharArray()) {
            if (c == '}') {
                String repeatString = "";
                char c2;
                while (true) {
                    c2 = stack.pop();
                    if (c2 != '{') {
                        repeatString = c2 + repeatString;
                    } else {
                        repeatNum = stack.pop() - '0';
                        break;
                    }
                }
                while (repeatNum-- > 0) {
                    for (char c3 : repeatString.toCharArray()) {
                        stack.push(c3);
                    }
                }
            } else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            answer = stack.pop() + answer;
        }

        return answer;
    }
}
// 문자열을 charArray로 쪼개서 한 글자 씩 stack에 넣어봄
// 만약 }를 만난다면 {를 만날 때 까지 stack에서 pop하고, 그걸 String으로 따로 옮겨둠
// {를 만나서 빼고, 그 앞의 숫자를 뺌
// 그 숫자만큼 옮겨둔 String을 반복하여 다시 쪼개서 stack에 넣음
// charArray를 Stack에 다 넣었다면
// stack의 값을 꺼내서 answer로 return