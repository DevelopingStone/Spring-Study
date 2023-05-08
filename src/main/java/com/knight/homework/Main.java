package com.knight.homework;


public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
//    String[] str = {"aya", "yee", "u", "maa", "wyeoo"};
//    String[] str1 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
//    int[][] arr1 = {{1,1},{2,1},{2,2},{1,2}};
//    int[][] arr2 = {{-1,-1},{1,1},{1,-1},{-1,1}};
    String[] id_pw = {"programmer00", "1145"};
    String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
    System.out.println(user.solution(1081));


  }


}


class Solution {

  public int solution(int chicken) {
    int count = 0;
    int coupon = 0;
    while (chicken / 10 != 0) {
      count += chicken / 10;
      System.out.println("count = " + count);
      coupon += chicken % 10;
      System.out.println("coupon = " + coupon);
      chicken = chicken / 10;
      System.out.println("chicken = " + chicken);
      chicken=chicken+coupon;
      coupon=0;
      System.out.println("chicken = " + chicken);
    }
    System.out.println(coupon);


    return count;
  }
}