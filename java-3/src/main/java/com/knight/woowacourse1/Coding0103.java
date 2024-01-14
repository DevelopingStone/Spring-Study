package com.knight.woowacourse1;

public class Coding0103 {

    public static void main(String[] args) {

        System.out.println(new solution0103().game369(33));


    }


}

class solution0103 {

    public int game369(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            String str = Integer.toString(i);
            for (String num : str.split("")) {
                if (num.equals("3") || num.equals("6") || num.equals("9")) {
                    result++;
                }
            }
        }


        return result;
    }

}
