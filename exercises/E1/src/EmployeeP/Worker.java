package EmployeeP;

import java.util.Date;

public class Worker extends Employee {
    int hoursDue;
    double wage;

    public Worker(String employeeID, Date dateHired, double wage) {
        super(employeeID, dateHired);
        this.wage = wage;
    }

    public double payDue() {
        return super.payDue() + hoursDue * wage;
    }

    public int hoursDue() {
        return hoursDue;
    }
    public void hoursDue(int hoursDue) {
        this.hoursDue = hoursDue;
    }

    public double wage() {
        return wage;
    }
    public void wage(double wage) {
        this.wage = wage;
    }

    public void addRaise(double raise) {
        wage += raise;
    }
}