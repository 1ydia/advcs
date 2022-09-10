import ShapeP.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ensure -ea tag is passed to debugger!");
        EmployeeTest();
        ShapeTest();
        TicketTest();
        VehicleTest();
        System.out.println("All Assertions Passed!");
    }

    static void EmployeeTest() {

    }

    static void ShapeTest() {
        double radius = 5;
        Circle c = new Circle(radius);
        assert c.radius == radius;
        assert c.perimeter() == 2 * Math.PI * radius;
        assert c.area() == Math.PI * radius * radius;

        double sideLength = 5;
        Square s = new Square(sideLength);
        assert s.sideLength == sideLength;
        assert s.perimeter() == sideLength * 4;
        assert s.area() == sideLength * sideLength;
    }

    static void TicketTest() {

    }

    static void VehicleTest() {

    }
}
