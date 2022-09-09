import java.util.Date;

public class Employee {
    String employeeID;
    Date dateHired;
    boolean active = false;

    Employee(String employeeID, Date dateHired) {
        this.employeeID = employeeID;
        this.dateHired = dateHired;
    }

    public double payDue() {
        return 0;
    }

    public boolean active() {
        return active;
    }
    public void active(boolean active) {
        this.active = active;
    }
}