import java.time.chrono.ThaiBuddhistChronology;

public class Package {
    private String name = "";
    private int quantity= 0;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;
    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

    }
    public String order() {
        orderedState = new OrderedState(this,this.quantity);
        setState(orderedState);
        return getName()+ " "+ orderedState.getStatus()+"\n"+getName() +" "+orderedState.getETA();
    }
    public String mail() {
        inTransitState = new InTransitState(this,this.quantity);
        setState(inTransitState);
        return getName() +" "+inTransitState.getStatus()+"\n"+getName() +" "+inTransitState.getETA();
    }
    public String received() {
        deliveredState = new DeliveredState(this,this.quantity);
        setState(deliveredState);
        return getName()+" "+deliveredState.getStatus();
    }
    public String delay() {
        return getName()+this.state.delay()+"\n" +getName()+" "+this.state.getETA();
    }
    public void setState(State state) {
        this.state = state;
    }
    public String getName() {
        return this.name;
    }
}
