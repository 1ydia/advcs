/*
How might you go about this problem with an interface? Would it be better than
Inheritance?

I imagine that I might make an interface, TicketType, that inherits from Ticket.
If students get 20% off on saturdays, I can then just overload the required method,
but if no one else gets anything special but different prices, why bother?
*/

public class Ticket {
    public static double baseCost = 0;
    boolean isAdvance;

    Ticket(boolean isAdvance) {
        this.isAdvance = isAdvance;
    }

    public boolean isAdvance() {
        return isAdvance;
    }
    public void isAdvance(boolean isAdvance) {
        this.isAdvance = isAdvance;
    }

    public double cost() {
        return baseCost;
    }
}