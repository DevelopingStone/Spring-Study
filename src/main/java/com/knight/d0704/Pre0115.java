package com.knight.d0704;

public class Pre0115 {
    public static void main(String[] args) {
        Solution0115 user = new Solution0115();
        int[] arr = {-2, -3, -1, -5, -4};
        System.out.println(user.solution(arr));


    }

}






class Solution0115 {

    public int solution(int[] fruits) {
        int sum = 0, tmp = 0;

        for (int fruArr : fruits) {
            tmp += fruArr;
            if (tmp > sum) {
                sum = tmp;
            } else if (tmp < 0) {
                tmp = 0;
            }
        }

        return sum;
    }
}