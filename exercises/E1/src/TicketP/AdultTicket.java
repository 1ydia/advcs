package TicketP;

public class AdultTicket extends Ticket {
    public static double fee = 59.99;

    public AdultTicket(boolean isAdvance) {
        super(isAdvance);
    }

    public double cost() {
        return super.cost() + fee;
    }
}
