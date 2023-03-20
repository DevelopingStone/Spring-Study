package Computer;

public class Computer {

    public static final Computer INSTANCE = getInstance();

    private String brand;
    private String model;
    private int price;

    private Computer() { }

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
        Computer computer = Computer.INSTANCE;
        computer.printInfo();
    }
}

