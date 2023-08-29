package com.knight.main;

public class Main01 {

    public static void main(String[] args) {

        System.out.println(new Solution01().solution(new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}, 2));


    }
}


class Solution01 {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb = new StringBuilder();
        int position = 0;
        int num = k;


        for (String str : picture) {
            num = k;

            while (num > 0) {
                for (int i = 0; i < str.length(); i++) {
                    for (int j = 0; j < k; j++) {
                        sb.append(str.charAt(i));
                    }

                }
                answer[position++] = sb.toString();
                sb.setLength(0);
                num--;
            }

        }


        return answer;
    }
}
