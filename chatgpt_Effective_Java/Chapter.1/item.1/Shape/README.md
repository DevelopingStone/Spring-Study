> 📌 이펙티브 자바 item.1 정적 팩터리 활용 문제

아래와 같은 Shape 인터페이스가 있습니다.

```java
public interface Shape{
    double area();
}
```

위 인터페이스를 구현하는 Shape.Rectangle, Shape.Triangle, Shape.Circle 인터페이스가 각각 하나씩 있습니다. 이들 인터페이스를 이용하여 다음과
같은 정적 팩터리 메서드를 갖는 Shape.ShapeFactory 클래스를 만들어보세요.

createRectangle(double width, double height) : width와 height를 이용하여 Shape.Rectangle 객체를 생성합니다.
createTriangle(double base, double height) : base와 height를 이용하여 Shape.Triangle 객체를 생성합니다.
createCircle(double radius) : radius를 이용하여 Shape.Circle 객체를 생성합니다.
각 팩터리 메서드는 적절한 타입의 객체를 반환합니다. main() 메서드에서 ShapeFactory의 각 팩터리 메서드를 이용하여 객체를 생성해보세요.
