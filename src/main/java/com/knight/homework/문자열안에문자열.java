package com.knight.homework;

import java.util.Scanner;

public class 문자열안에문자열 {

  public static void main(String[] args) {

//    Solution22 user = new Solution22();
//    System.out.println(user.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));

    Scanner scan = new Scanner(System.in);
    String str = "";
    int sum = 0;

    while (!"=".equals(str)) {
      str = scan.next();
      if("+".equals(str)){
        str = scan.next();
        sum+=Integer.parseInt(str);
      }
      else if("-".equals(str)){
        str = scan.next();
        sum-=Integer.parseInt(str);
      }
      else if("*".equals(str)){
        str = scan.next();
        sum*=Integer.parseInt(str);
      }
      else if("/".equals(str)){
        str = scan.next();
        sum/=Integer.parseInt(str);
      }
      else if("=".equals(str)){
        break;
      }
      else{
        sum+=Integer.parseInt(str);
      }


    }
    System.out.println(sum);


  }

}


class Solution22 {

  public int solution(String str1, String str2) {

    System.out.println(str1.contains(str2));

    return 2;
  }
}