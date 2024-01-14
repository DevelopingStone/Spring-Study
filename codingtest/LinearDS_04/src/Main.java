// 선형 자료구조 - 연결 리스트
// 단순 연결 리스트 (simple ver.) 기본 구조 구현

// 노드
/*

class Node {

  Node next;
  int data;

  public Node() {
  }

  public Node(int data,Node next) {
    this.next = next;
    this.data = data;
  }

}

class LinkedList {

  Node head;

  public LinkedList() {
  }

  public LinkedList(Node head) {
    this.head = head;
  }

  //  연결 리스트 비어있는지 확인
  public boolean isEmpty() {
    if (head == null) {
      System.out.println("빈값입니다.");
      return true;
    }
    return false;


  }

//  연결 리스트의 맨 뒤에 데이터 추가
  public void addData(int data){
    if(head == null){
      head = new Node(data, null);
    }
    else{
      Node cur = this.head;
      while(cur.next !=null){
        cur = cur.next;
      }
      cur.next = new Node(data, null);
    }
  }



//  연결 리스트의 맨 뒤의 데이터 삭제

//  연결 리스트에서 데이터 찾기

//  연결 리스트의 모든 데이터 출력
}

public class Main {

  public static void main(String[] args) {

//      Test Code
        LinkedList myList = new LinkedList(new Node(1, null));
//        myList.showData();      // 1

        myList.addData(2);
        myList.addData(3);
        myList.addData(4);
        myList.addData(5);
//        myList.showData();      // 1 2 3 4 5
//
//        myList.findData(3);     // Data exist!
//        myList.findData(100);   // Data not found!
//
//        myList.removeData();
//        myList.removeData();
//        myList.removeData();
//        myList.showData();      // 1 2
//
//        myList.removeData();
//        myList.removeData();
//        myList.removeData();    // List is empty

  }

}
*/
