package com.knight.june27;

public class Pre0110 {
    public static void main(String[] args) {
        Solution0110 user = new Solution0110();
        System.out.println(user.solution(-340));

    }

}

class Solution0110 {
    public int solution(int num) {
        int answer;
        int minus = 1;
        StringBuilder sb = new StringBuilder(Integer.toString(num));

        if (sb.charAt(0) == '-') {
            minus = -1;
            sb.deleteCharAt(0);
        }

        answer = Integer.parseInt(sb.reverse().toString());
        if (answer >= 100000 || answer <= -100000) {
            answer = 0;
        }
        return answer * minus;
    }
}