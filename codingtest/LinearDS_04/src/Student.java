// 학생 정보를 담는 Student 클래스
public class Student {

  private int id;
  private String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

// 연결 리스트의 노드
class Node {

  Student student;
  Node next;

  public Node(Student student) {
    this.student = student;
    this.next = null;
  }

  public Student getStudent() {
    return student;
  }
}