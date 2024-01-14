// 선형 자료구조 - 큐


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList(Arrays.asList(1,2,3,4,5));
        System.out.println(queue);

        System.out.println(queue.poll());

    }
}
