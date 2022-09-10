package TicketP;

public class SeniorTicket extends Ticket {
    public static double fee = 29.99;

    SeniorTicket(boolean isAdvance) {
        super(isAdvance);
    }

    public double cost() {
        return super.cost() + fee;
    }
}
