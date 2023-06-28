package com.knight.june27;

public class Pre0114 {
    public static void main(String[] args) {
        Solution0114 user = new Solution0114();
        System.out.println(user.solution(292, 153));
    }
}


class Solution0114 {

    public int solution(int A, int B) {
        int count = 0;

        String a = Integer.toBinaryString(A);
        String b = Integer.toBinaryString(B);


        if (a.length() > b.length()) {
            int num = a.length() - b.length();
            while (num != 0) {
                b = "0" + b;
                num--;
            }


        } else if (a.length() < b.length()) {
            int num = b.length() - a.length();
            while (num != 0) {
                a = "0" + a;
                num--;
            }
        }


        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }

        return count;
    }

}