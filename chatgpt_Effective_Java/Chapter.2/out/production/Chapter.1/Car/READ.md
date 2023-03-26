> > 📌 이펙티브 자바 item.2 빌더 패턴 활용 문제

해당 코드에서 리팩토링(빌더)이 필요한 부분을 찾아내보세요.

```java
public class Car {
private String brand;
private String model;
private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public static Car getInstance() {
        return new Car("Kia", "K5", 2022);
    }

    public void drive() {
        System.out.println("The " + year + " " + brand + " " + model + " is driving!");
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        Car car = Car.getInstance();
        car.drive();

        car.setYear(2023);
        car.drive();
    }
}
```
위 코드에서는 Car 클래스를 정의하고 있습니다. 
Car 클래스는 자동차의 브랜드, 모델, 연식을 나타내는 필드를 가지고 있으며, getInstance() 메서드를 통해 인스턴스를 생성할 수 있습니다. 
drive() 메서드는 자동차가 주행하는 것을 출력하는 예시 메서드입니다.

위 코드에 대해서, getInstance() 메서드에서 반환하는 Car 인스턴스의 연식 값을 변경하고자 한다면, 어떤 코드 변경이 필요할까요?
*/