import java.util.Date;

public class Employee {
    String employeeID;
    Date dateHired;
    boolean active;

    public double payDue() {
        return 0;
    }

    public void active(boolean active) {
        this.active = active;
    }
    public boolean active() {
        return active;
    }
}