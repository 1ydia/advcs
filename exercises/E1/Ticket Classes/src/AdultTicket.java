public class AdultTicket extends Ticket {
    public static double fee = 59.99;

    AdultTicket(boolean isAdvance) {
        super(isAdvance);
    }

    public double cost() {
        return super.cost() + fee;
    }
}
