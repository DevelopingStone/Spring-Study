> 📌 이펙티브 자바 item.2 빌더 패턴 활용 문제

아래와 같은 Person 클래스가 있습니다.

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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
```

위 클래스를 빌더 패턴을 이용하여 재구현하고, main() 메서드에서 Person 객체를 생성해보세요.
