package com.knight.month;

public class month02 {

  public static void main(String[] args) {

    Solution02 user = new Solution02();
    int[] sweetness = {13, 2, 1, 5, 15};
    int[] weights = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int target = 30;
    System.out.println(user.solution(sweetness, weights, target));



  }


}


class Solution02 {

  private int weight = Integer.MAX_VALUE;

  public int solution(int[] sweetness, int[] weights, int target) {
    findCombinations(sweetness, weights, target, 0, 0, 0);
    return weight == 101 ? -1 : weight;
  }

  private void findCombinations(int[] sweetness, int[] weights, int target, int idx,
      int sumSweetness, int sumWeight) {
    if (idx == sweetness.length) {
      if (sumSweetness == target) {
        weight = Math.min(weight, sumWeight);
      }
      return;
    }
    findCombinations(sweetness, weights, target, idx + 1, sumSweetness, sumWeight);
    findCombinations(sweetness, weights, target, idx + 1, sumSweetness + sweetness[idx],
        sumWeight + weights[idx]);
  }
}