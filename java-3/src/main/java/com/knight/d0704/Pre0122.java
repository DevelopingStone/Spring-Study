package com.knight.d0704;

public class Pre0122 {

    public static void main(String[] args) {
        Solution0122 user = new Solution0122();
        System.out.println(user.solution(-3278, 3));

    }
}


class Solution0122 {

    public int solution(int N, int K) {
        if (N > 0) {
            return plus(N, K);
        } else {
            return minus(N, K);
        }
    }

    public int plus(int N, int K) {

        StringBuilder sb = new StringBuilder();
        String n = Integer.toString(N);

        for (int i = 0; i < n.length(); i++) {
            if (Integer.parseInt(String.valueOf(n.charAt(i))) > K) {
                sb.append(n.charAt(i));
                if (i == n.length() - 1) {
                    sb.append(Integer.toString(K));
                }
            } else {
                sb.append(Integer.toString(K));
                sb.append(n, i, n.length());
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }



    public int minus(int N, int K) {

        StringBuilder sb = new StringBuilder();
        String n = Integer.toString(-N);

        for (int i = 0; i < n.length(); i++) {
            if (Integer.parseInt(String.valueOf(n.charAt(i))) <= K) {
                sb.append(n.charAt(i));
                if (i == n.length() - 1) {
                    sb.append(Integer.toString(K));
                }
            } else {
                sb.append(Integer.toString(K));
                sb.append(n, i, n.length());
                break;
            }
        }
        return -Integer.parseInt(sb.toString());
    }
}