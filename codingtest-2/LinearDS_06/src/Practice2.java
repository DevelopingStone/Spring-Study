// Practice2
// 배열을 이용한 기본 스택 직접 구현

import java.util.Arrays;

class MyStack2 {

  int[] arr;
  int count = 0;
  int top = -1;


  MyStack2(int size) {
    arr = new int[size];
  }

  public boolean isEmpty() {
    if (arr.length == 0) {
      System.out.println("true");
      return true;
    } else {
      System.out.println("flase");
      return false;
    }
  }



  public void push(int data) {
    if (count == arr.length) {
      System.out.println("사이즈가 꽉찼누");
      return;
    }
    arr[count] = data;
    count++;

  }

  public Integer pop() {
    int a = arr[count - 1];
    arr[count - 1] = 0;
    count--;
    return a;
  }

  public Integer peek() {
    return arr[count - 1];
  }

  public void printStack() {
    System.out.println(Arrays.toString(arr));
  }
}

public class Practice2 {

  public static void main(String[] args) {

    // Test code
    MyStack2 myStack = new MyStack2(5);
    myStack.isEmpty();
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(4);
    myStack.push(5);
    myStack.push(6);
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
