public class OrderedState extends State{
    private int days = 2;
    public OrderedState(Package pkg, int quantity) {
        super(pkg, quantity);

    }
    public String getStatus() {
        return getVerb("is","are")+" is ordered";
    }
    public String getETA() {
        return " should arrive within "+ days+ " days";
    }
    public String delay() {
        days = days + 2;
        return " experienced a slight delay in manufacturing";
    }
}
