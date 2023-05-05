

public class Node {

  private Student student;
  private Node next;

  public Node(Student student) {
    this.student = student;
    this.next = null;
  }

  public Student getStudent() {
    return student;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}

class LinkedList {

  private Node head;

  public void insert(Student student) {
    Node newNode = new Node(student);

    if (head == null) {
      head = newNode;
    } else {
      Node currentNode = head;

      while (currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }

      currentNode.setNext(newNode);
    }
  }

  public Node getHead() {
    return head;
  }
}


