public class Student {

  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

class Main {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.insert(new Student("Alice", 20));
    list.insert(new Student("Bob", 21));
    list.insert(new Student("Charlie", 22));

    Node currentNode = list.getHead();

    while (currentNode != null) {
      Student student = currentNode.getStudent();
      System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
      currentNode = currentNode.getNext();
    }
  }
}