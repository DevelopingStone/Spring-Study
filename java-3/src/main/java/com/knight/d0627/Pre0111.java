package com.knight.d0627;

public class Pre0111 {
    public static void main(String[] args) {
        Solution0111 user = new Solution0111();
        System.out.println(user.solution("11222222233333"));
    }
}

class Solution0111 {

    public String solution(String s) {
        int[] arr = new int[10];
        int cnt = 0;

        for (String str : s.split("")) {
            int num = Integer.parseInt(str);
            arr[num]++;
        }

        StringBuilder answerBuilder = new StringBuilder();

        while (cnt < arr.length) {
            int maxNum = -1;
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxNum) {
                    maxNum = arr[i];
                    index = i;
                }
            }
            if (maxNum == 0) {
                break;
            }
            answerBuilder.append(index);
            arr[index] = -1;
            if (cnt != arr.length - 1) {
                answerBuilder.append(" ");
            }
            cnt++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                answerBuilder.append(i);
                if (cnt != arr.length - 1) {
                    answerBuilder.append(" ");
                }
                cnt++;
            }
        }

        return answerBuilder.toString();
    }
}
