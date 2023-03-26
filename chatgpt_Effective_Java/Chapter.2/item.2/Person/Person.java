package Person;

public class Person {
    private final String name;
    private final int age;

    public static class Builder {

        private String name;
        private int age;

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    private Person(Builder builder) {
        name = builder.name;
        age = builder.age;
    }

    public static void main(String[] args) {
        Person person = new Builder().age(12).name("GhatGpt").build();
        System.out.println(person.age);
    }
}

