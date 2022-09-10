package TicketP;

public class StudentTicket extends Ticket {
    public static double fee = 39.99;

    StudentTicket(boolean isAdvance) {
        super(isAdvance);
    }

    public double cost() {
        return super.cost() + fee;
    }
}