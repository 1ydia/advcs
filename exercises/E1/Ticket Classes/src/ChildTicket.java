public class ChildTicket extends Ticket {
    public static double fee = 29.99;

    ChildTicket(boolean isAdvance) {
        super(isAdvance);
    }

    public double cost() {
        return super.cost() + fee;
    }
}
