import java.util.LinkedHashMap;

public class Practice3 {

  public static void solution(int[] data) {

  }

  public static void main(String[] args) {

//        int[] balloon = {3, 2, 1, -3, -1};
//        solution(balloon);
//
//        System.out.println();
//        balloon = new int[]{3, 2, -1, -2};
//        solution(balloon);

    LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();

    hm.put(100, 200);
    hm.put(200, 300);
    int firstKey = hm.keySet().iterator().next();
    System.out.println("firstKey = " + firstKey);

    System.out.print("바보");


  }
}
