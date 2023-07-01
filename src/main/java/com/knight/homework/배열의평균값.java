package com.knight.homework;

public class 배열의평균값 {

  public static void main(String[] args) {


    main5 user = new main5();
    int[] array = {1,2,3,4,5,6,7,8,9,10};
    user.solution(array);


  }

}

class main5{
int sum = 0;
int avg = 0;
  public double solution(int[] array){

    for(int i : array){
      sum+=i;
    }
    return avg = sum/array.length;







  }

}
