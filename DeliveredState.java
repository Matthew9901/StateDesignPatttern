public class DeliveredState extends State{
    
    public DeliveredState(Package pkg, int quantity) {
        super(pkg, quantity);
    }
    public String getStatus() {
        return super.getVerb("is","are")+" here for you";
    }
    public String getETA() {
        return "Is here";
    }
    public String delay() {
        return " has experienced a delay during its delivery process";
    }
}
