package com.knight.d0704;

public class Pre0108 {

    public static void main(String[] args) {

        Solution0108 user = new Solution0108();
        int[] arr = {1, 3, 0, 7, 9};
        System.out.println(user.solution(arr, "<", ", ", ">"));
    }

}

class Solution0108 {
    public String solution(int[] arr, String prefix, String separator, String postfix) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        for (int i = 0; i < arr.length; i++) {
            sb.append(Integer.toString(arr[i]));
            if (i == arr.length - 1) {
                break;
            }
            sb.append(separator);
        }
        sb.append(postfix);
        return sb.toString();
    }
}