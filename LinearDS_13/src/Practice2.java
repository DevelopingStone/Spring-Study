// Practice2
// 정수형 배열 nums 와 target 이 주어졌을 때,
// nums 에서 임의의 두 수를 더해 target 을 구할 수 있는지 확인하는 프로그램을 작성하세요.
// 두 수 의 합으로 target 을 구할 수 있으면 해당 값의 index 를 반환하고,
// 없는 경우 null 을 반환하세요.

// 입출력 예시
// nums: 7, 11, 5, 3
// target: 10
// 출력: 0, 3

// nums: 8, 3, -2
// target: 6
// 출력: 0, 2


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Practice2 {
    public static int[] solution(int[] numbers, int target) {
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        int[] array = new int[2];
        for(int i =0; i<numbers.length; i++){
            hm.put(i,numbers[i]);
        }



        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if(hm.get(i)+hm.get(j)==target){
                    array[0]=i;
                    array[1]=j;
                    return array;
                }


                }

            }
        return null;
        }




    public static void main(String[] args) {
        // Test code
        int[] nums = {7, 11, 5, 3};
        System.out.println(Arrays.toString(solution(nums, 10)));

        nums = new int[]{8, 3, -2};
        System.out.println(Arrays.toString(solution(nums, 6)));

        nums = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(solution(nums, 12)));
    }
}
