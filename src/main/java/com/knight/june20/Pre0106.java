package com.knight.june20;

public class Pre0106 {

    public static void main(String[] args) {

        Solution0106 user = new Solution0106();
        System.out.println(user.solution(8, "Snowball", 113));
    }
}


class Solution0106 {
    public String solution(int n, String s, int t) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        int time = n;
        while (time > 0) {
            sb.append(".");
            time--;
        }
        sb.append(s);

        int front = (time + t) % 13;
        int back = (time + n + t) % 13;

        if (front < back) {
            result = sb.substring(front, back);
        } else if (front > back) {

            result += sb.substring(front, sb.length());
            result += sb.substring(0, back);
        }


        return result;
    }
}