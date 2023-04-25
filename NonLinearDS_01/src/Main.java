public class Main {

  public static void main(String[] args) {

    int[] array1 = {1,2,3,4,5};

    int[] array2 = array1.clone();

    array1[0]= 10;

    for(int i : array2){
      System.out.println(i);
    }



  }

}
