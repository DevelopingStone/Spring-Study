package com.knight.oop;

// 생성될 객체의 공통 인터페이스
interface Product {

  public void operation();
}

public class FactoryMehtod {

}

// Product 인터페이스를 구현하는 구체 클래스1
class ConcreteProduct1 implements Product {

  @Override
  public void operation() {
    System.out.println("ConcreteProduct1 operation");
  }
}

// Product 인터페이스를 구현하는 구체 클래스2
class ConcreteProduct2 implements Product {

  @Override
  public void operation() {
    System.out.println("ConcreteProduct2 operation");
  }
}

// 객체 생성을 담당하는 팩토리 클래스
class Creator {

  // 팩토리 메소드, 객체 생성 로직을 책임짐
  public Product createProduct(String type) {
    if (type.equals("type1")) {
      return new ConcreteProduct1();
    } else if (type.equals("type2")) {
      return new ConcreteProduct2();
    } else {
      throw new IllegalArgumentException("Invalid type: " + type);
    }
  }
}

// 예시로 팩토리 메소드 패턴을 사용하는 코드
class Client {

  public static void main(String[] args) {
    Creator creator = new Creator();
    Product product1 = creator.createProduct("type1"); // ConcreteProduct1 객체 생성
    Product product2 = creator.createProduct("type2"); // ConcreteProduct2 객체 생성
    product1.operation(); // "ConcreteProduct1 operation" 출력
    product2.operation(); // "ConcreteProduct2 operation" 출력
  }
}
