> 📌 이펙티브 자바 item.3 싱글턴 패턴 활용 문제

아래와 같은 Computer 클래스가 있습니다.

```java
public class Computer {
private String brand;
private String model;
private int price;

    public static Computer getInstance() {
        return new Computer("Dell", "XPS 13", 1200);
    }

    private Computer(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println(brand + " " + model + ", $" + price);
    }

    public static void main(String[] args) {
        Computer computer = Computer.getInstance();
        computer.printInfo();

        computer.setPrice(1300);
        computer.printInfo();
    }
}

```
위 클래스를 싱글턴 패턴을 이용하여 재구현하고, main() 메서드에서 Computer.Computer 객체를 생성하고 가격을 변경해보세요.
