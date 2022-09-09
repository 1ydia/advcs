public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double radius() {
        return radius;
    }
    public void radius(double radius) {
        this.radius = radius;
    }
}
