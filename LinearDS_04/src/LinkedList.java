public class LinkedList {
  private Node head;

  public LinkedList() {
    head = null;
  }

  // 학생 정보 추가
  public void add(Student student) {
    Node newNode = new Node(student);

    if (head == null) {
      head = newNode;
      return;
    }

    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
  }

  // 학생 정보 출력
  public void print() {
    Node current = head;

    while (current != null) {
      System.out.println("ID: " + current.getStudent().getId() + ", Name: " + current.getStudent().getName());
      current = current.next;
    }
  }
}

// 메인 클래스
class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    Student s1 = new Student(1, "Alice");
    Student s2 = new Student(2, "Bob");
    Student s3 = new Student(3, "Charlie");

    list.add(s1);
    list.add(s2);
    list.add(s3);

    list.print();
  }
}