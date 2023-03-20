package Car;

public class Car {

    private final String brand;
    private final String model;
    private final int year;

    public static class Builder {

        private String brand;
        private String model;
        private int year;


        public Builder brand (String val) {
            brand = val;
            return this;
        }

        public Builder model (String val) {
            model = val;
            return this;
        }

        public Builder year ( int val) {
            year = val;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        brand = builder.brand;
        model = builder.model;
        year = builder.year;
    }

    public static void main(String[] args) {
        Car car = new Car.Builder().brand("Chatgpt").model("GPT-3.5").year(2023).build();
        System.out.println(car.brand);
    }
}

