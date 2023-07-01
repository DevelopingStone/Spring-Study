package com.knight.zerobase.practice.three;

public class TwoAnd0203 {


}

class Solution0203 {

  public String solution(int[] arr, String prefix, String separator, String postfix) {
    StringBuilder sb = new StringBuilder();
    sb.append(prefix);
    for(int i =0; i<arr.length; i++){

      sb.append(Integer.toString(arr[i]));
      if(i+1==arr.length)
        continue;
      sb.append(separator);
    }

    sb.append(postfix);

    return sb.toString();
  }
}