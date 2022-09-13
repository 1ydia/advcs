import EmployeeP.*;
import ShapeP.*;
import TicketP.*;
import VehicleP.*;

import java.awt.*;
import java.util.Calendar;

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
        String employeeIDEmployee = "00000001";
        Calendar.Builder bEmployee = new Calendar.Builder();
        bEmployee.setDate(2000, 1, 1);
        Employee employee = new Employee(employeeIDEmployee, bEmployee.build().getTime());

        String employeeIDAdmin = "00000002";
        Calendar.Builder bAdmin = new Calendar.Builder();
        bAdmin.setDate(2000, 1, 2);
        Employee admin = new Employee(employeeIDAdmin, bAdmin.build().getTime());

        String employeeIDWorker = "00000003";
        Calendar.Builder bWorker = new Calendar.Builder();
        bWorker.setDate(2000, 1, 3);
        Employee worker = new Employee(employeeIDWorker, bWorker.build().getTime());
    }

    static void ShapeTest() {
        double radius = 5;
        Circle c = new Circle(radius);

        double sideLength = 5;
        Square s = new Square(sideLength);
    }

    static void TicketTest() {
        boolean isAdvanceAdult = false;
        Ticket adult = new Ticket(isAdvanceAdult);

        boolean isAdvanceChild = false;
        Ticket child = new Ticket(isAdvanceChild);

        boolean isAdvanceSenior = false;
        Ticket senior = new Ticket(isAdvanceSenior);

        boolean isAdvanceStudent = false;
        Ticket student = new Ticket(isAdvanceStudent);

        boolean isAdvance = false;
        Ticket ticket = new Ticket(isAdvance);
    }

    static void VehicleTest() {
        Color colorC = new Color(0xB83A3A);
        int axlesC = 2;
        String VINC = "IAmAVIN";
        int modelYearC = 2008;
        double mileageC = 13.9;
        int cupholdersC = 6;
        Car car = new Car(colorC, axlesC, VINC, modelYearC, mileageC, cupholdersC);

        Color colorT = new Color(0xB83A3A);
        int axlesT = 2;
        String VINT = "IAmAVIN";
        int modelYearT = 2008;
        double horsepowerT = 9001.0;
        boolean hasPlowPackageT = true;
        Truck truck = new Truck(colorT, axlesT, VINT, modelYearT, horsepowerT, hasPlowPackageT);
    }
}
