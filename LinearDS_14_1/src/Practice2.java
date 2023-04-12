import java.util.Arrays;

public class Practice2 {

  public static void solution(int[][] matrix) {
    int[][] arr = matrix;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[i][j] == 0) {
          arr[i][j] = -1;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[i][j] == -1) {
          for (int k = 0; k < arr.length; k++) {
            arr[i][k] = 0;
          }
          for (int k = 0; k < arr.length; k++) {
            arr[k][j] = 0;
          }
        }
      }
    }

  }

  public static void main(String[] args) {

    int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    solution(matrix);
    System.out.println(Arrays.deepToString(matrix));

    System.out.println();
    matrix = new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
    solution(matrix);
    System.out.println(Arrays.deepToString(matrix));
  }
}
