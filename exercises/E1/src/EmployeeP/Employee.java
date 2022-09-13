package EmployeeP;

import java.util.Date;

public class Employee {
    String employeeID;
    Date dateHired;
    boolean active = false;

    public Employee(String employeeID, Date dateHired) {
        this.employeeID = employeeID;
        this.dateHired = dateHired;
    }

    public double payDue() {
        return 0;
    }

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}