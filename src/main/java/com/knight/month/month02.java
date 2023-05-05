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
    // 가능한 모든 조합을 찾는 메소드 실행
    findCombinations(sweetness, weights, target, 0, 0, 0);
    // 찾은 모든 조합 중, target 달성이 가능한 가장 작은 무게를 리턴 (만약 target을 달성할 수 없다면 -1을 리턴)
    return weight == 101 ? -1 : weight;
  }

  private void findCombinations(int[] sweetness, int[] weights, int target, int idx,
      int sumSweetness, int sumWeight) {
    // 마지막 인덱스까지 모든 물건 확인한 경우
    if (idx == sweetness.length) {
      // 현재 조합의 당도 합이 목표 당도와 같은 경우, 최소 무게를 찾아 갱신
      if (sumSweetness == target) {
        weight = Math.min(weight, sumWeight);
      }
      return;
    }
    // 현재 물건 선택하지 않고 다음 아이템으로 넘어가는 경우
    findCombinations(sweetness, weights, target, idx + 1, sumSweetness, sumWeight);
    // 현재 물건 선택한 경우, 당도와 무게를 각각 누적하여 다음 물건 넘어감
    findCombinations(sweetness, weights, target, idx + 1, sumSweetness + sweetness[idx],
        sumWeight + weights[idx]);
  }
}
