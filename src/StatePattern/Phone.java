package StatePattern;

public class Phone {

    private State state;

    public Phone() {
        this.state = new TurnedOffState(this);
    }

    public void changePhoneState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

}
