// 선형 자료구조 - 스택

import java.util.Stack;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    System.out.println(stack.peek());
    System.out.println(stack);

    System.out.println(stack.contains(6));
    stack = stack.stream().filter(x -> x >= 4).collect(Collectors.toCollection(Stack::new));
    System.out.println(stack);
    System.out.println(stack.size());
    System.out.println(stack.empty());
    stack.clear();
    System.out.println(stack);
    stack.push(2);
    stack.pop();



  }

}
