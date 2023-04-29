package com.knight.zerobase.practice.two;

public class TwoAnd0205a {

  public static void main(String[] args) {
    Solution0205a user = new Solution0205a();
    System.out.println(user.solution(-430));

  }

}

class Solution0205a {

  public int solution(int num) {
    int reversed = 0;
    int sign = 1;

    if (num < 0) {
      sign = -1;
      num = -num;
    }
    // 입력된 숫자가 음수일 경우 부호를 저장해둔다.

    while (num > 0) {
      reversed = reversed * 10 + num % 10; // 현재 뒤집은 값에 10을 곱하고, num의 일의 자리 수를 더한다.
      num /= 10; // num의 일의 자리 수를 없앤다.
    }



















    return reversed * sign <= 100000 && reversed * sign >= -100000 ? reversed * sign : 0;
//     뒤집은 숫자에 부호를 곱한 값이 -100000보다 작거나 100000보다 크면 0을 반환한다.
//     입력된 숫자를 뒤집는다.


  }
}
