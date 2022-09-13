package TicketP;

public class ChildTicket extends Ticket {
    public static double fee = 29.99;

    public ChildTicket(boolean isAdvance) {
        super(isAdvance);
    }

    public double cost() {
        return super.cost() + fee;
    }
}
