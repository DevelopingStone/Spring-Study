package com.knight.zerobase.coding2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OneAnd02 {

  public static void main(String[] args) {

    String [] name = {"제로","제로"};
    Solution02 user = new Solution02 ();
    System.out.println(user.solution(name));

  }

}

class Solution02 {
  public int solution(String[] names) {
    Set<String> set = new HashSet<>(Arrays.asList(names));
    return set.size()*set.size()-1*set.size()-2*set.size()-3/24;
  }
}