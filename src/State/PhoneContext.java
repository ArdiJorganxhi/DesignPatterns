package State;

public class PhoneContext implements State {

    private State state;
    @Override
    public void doAction() {
        this.state.doAction();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
