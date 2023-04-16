import java.util.ArrayList;
import java.util.List;

public class Practice3 {

  public static void solution(int[] data) {

    List<Integer> list = new ArrayList<>();
    List<Integer> num = new ArrayList<>();
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < data.length; i++) {
      list.add(data[i]);
      num.add(i + 1);

    }


    int index = 0;
    result.add(num.remove(0));
    index = list.remove(0);


    for (int i = 0; i < num.size(); i++) {
      index = Math.abs(index);
      index = (index-1) % list.size();
      result.add(num.remove(index));
      index = list.remove(index);



    }
    System.out.println(result);


  }


  public static void main(String[] args) {

    int[] balloon = {3, 2, 1, -3, -1};
    solution(balloon);

    System.out.println();
    balloon = new int[]{3, 2, -1, -2};
    solution(balloon);


  }
}
