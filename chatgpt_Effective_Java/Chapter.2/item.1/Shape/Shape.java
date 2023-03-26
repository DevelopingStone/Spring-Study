package Shape;

interface ShapeFactory {
    double area();

    static ShapeFactory createRectangle(double width , double height) {
        return new Rectangle(width,height);
    }

    static ShapeFactory createTriangle(double base , double height) {
        return new Triangle(base , height);
    }

    static ShapeFactory createCircle(double radius) {
        return new Circle(radius);
    }
}

class Rectangle implements ShapeFactory {
    private final double width;
    private final double height;

    Rectangle(double width , double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Triangle implements ShapeFactory {
    private final double base;
    private final double height;

    Triangle(double base , double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

class Circle implements ShapeFactory {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}

public class Shape {
    public static void main(String[] args) {
        System.out.println(ShapeFactory.createRectangle(10,20).area());
    }
}
/*
interface Shape.ShapeFactory {
    double area();
}

class Shape.Rectangle implements Shape.ShapeFactory {
    private final double width;
    private final double height;

    Shape.Rectangle(double width , double height) {
        this.width=width;
        this.height=height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Shape.Triangle implements Shape.ShapeFactory {

    private final double base;
    private final double height;

    Shape.Triangle(double base , double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

class Shape.Circle implements Shape.ShapeFactory {

    private final double radius;

    Shape.Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Shape.Shape {
    public static void main(String[] args) {
        Shape.Rectangle rectangle = new Shape.Rectangle(1,2);
        System.out.println("Shape.Rectangle area: " + rectangle.area());

        Shape.Triangle triangle = new Shape.Triangle(3,4);
        System.out.println("Shape.Triangle area: " + triangle.area());

        Shape.Circle circle = new Shape.Circle(2);
        System.out.println("Shape.Circle area: " + circle.area());
    }
}


 */
