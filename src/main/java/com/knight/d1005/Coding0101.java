package com.knight.d1005;

public class Coding0101 {
    public static void main(String[] args) {

//        -2,147,483,648 ~ 2,147,483,647

        System.out.println(new Solution0101().solution("   +  00051241231004242542514243_41251243"));

    }
}

class Solution0101 {


    public int solution(String s) {
        long answer = 0;
        String trimS = s.trim();
        trimS = trimS.replaceAll(" ", "");

        if (trimS.charAt(0) == '-') {
            trimS = trimS.substring(1);
            trimS = trimS.replaceAll("^0+", "");

            System.out.println("trimS = " + trimS);

            try {
                for (String str : trimS.split("[^0-9]+")) {

                    answer = -Integer.parseInt(str);
                    break;
                }
            }
            catch (Exception e){
                return -2147483647;

            }
            


        } else if (trimS.charAt(0) == '+') {
            trimS = trimS.substring(1);
            trimS = trimS.replaceAll("^0+", "");

            System.out.println("trimS = " + trimS);

            try {
                for (String str : trimS.split("[^0-9]+")) {
                    answer = Integer.parseInt(str);
                    break;
                }
            }
            catch (Exception e){
                return 2147483647;

            }

        } else {
            trimS = trimS.substring(1);
            trimS = trimS.replaceAll("^0+", "");

            System.out.println("trimS = " + trimS);

            try {
                for (String str : trimS.split("[^0-9]+")) {
                    answer = Integer.parseInt(str);
                    break;
                }
            }
            catch (Exception e){
                return 2147483647;

            }

        }


        return (int) answer;
    }


}
