// 선형 자료구조 - 데크


import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

      Deque<Integer> deque = new ArrayDeque<>();

        // Front 부분 입력
      deque.addFirst(10);
      deque.addFirst(9);
      deque.addFirst(8);
      deque.addFirst(7);
      System.out.println("deque = " + deque);

        // Rear 부분 입력

      deque.addLast(11);
      deque.addLast(12);
      deque.addLast(13);
      System.out.println("deque = " + deque);


        // Front 부분 출력
      System.out.println(deque.removeFirst());

        // Rear 부분 출력
      System.out.println(deque.removeLast());
      System.out.println("deque = " + deque);

      Deque<Integer> deque1 = new ArrayDeque<>();


    }
}

