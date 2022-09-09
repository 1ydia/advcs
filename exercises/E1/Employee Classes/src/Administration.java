import java.util.Date;

public class Administration extends Employee {
    int paychecksDue;
    double paycheck;

    Administration(String employeeID, Date dateHired, double paycheck) {
        super(employeeID, dateHired);
        this.paycheck = paycheck;
    }

    public double payDue() {
        return super.payDue() + paychecksDue * paycheck;
    }

    public int paychecksDue() {
        return paychecksDue;
    }
    public void paychecksDue(int paychecksDue) {
        this.paychecksDue = paychecksDue;
    }

    public double wage() {
        return paycheck;
    }
    public void wage(double wage) {
        this.paycheck = wage;
    }

    public void addRaise(double raise) {
        paycheck += raise;
    }
}
