// Practice1
// ArrayList 를 이용한 스택 구현

import java.util.ArrayList;

class MyStack1 {

  ArrayList list;

  MyStack1() {

    this.list = new ArrayList();
  }

  public boolean isEmpty() {
    if (list.size() == 0 || list == null) {
      System.out.println("true");
      return true;
    } else {
      System.out.println("false");
      return false;
    }
  }

  public void push(int data) {
    list.add(data);

  }


  public Integer pop() {
    return (Integer) list.remove(list.size() - 1);


  }

  public Integer peek() {

    return (Integer) list.get(list.size() - 1);
  }

  public void printStack() {

    System.out.println(list);
  }
}

public class Practice1 {

  public static void main(String[] args) {
    // Test code
    MyStack1 myStack = new MyStack1();
    myStack.isEmpty();

    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(4);
    myStack.push(5);
    myStack.printStack();               // 1, 2, 3, 4, 5

    System.out.println(myStack.peek()); // 5
    myStack.printStack();               // 1, 2, 3, 4, 5

    System.out.println(myStack.pop());  // 5
    System.out.println(myStack.pop());  // 4
    myStack.printStack();               // 1, 2, 3

    System.out.println(myStack.pop());  // 3
    System.out.println(myStack.pop());  // 2
    System.out.println(myStack.pop());  // 1
    myStack.printStack();
  }
}
