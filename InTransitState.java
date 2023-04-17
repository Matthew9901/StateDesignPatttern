public class InTransitState extends State {
    private int days = 5;
    public InTransitState(Package pkg, int quantity) {
        super(pkg, quantity);
    }
    public String getStatus() {
        return getVerb("is","are")+" out for delivery";
    }
    public String getETA() {
        return " will be shipped in "+days+" business days";
    }
    public String delay() {
        days=days+3;
        return " experienced a slight delay in manufacturing";
    }
}
