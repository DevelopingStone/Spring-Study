package com.knight.june27;

public class Pre0116 {
    public static void main(String[] args) {


    }
}


class Solution0116 {

        public int solution(int N, int K) {
            int count = 0;

            for (int i = 1; i <= N; i++) {
                String str = Integer.toString(i);
                for (String word : str.split("")) {
                    if (Integer.toString(K).equals(word)) {
                        count++;
                    }
                }

            }


            return count;
        }

}