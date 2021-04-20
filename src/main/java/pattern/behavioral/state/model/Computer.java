package pattern.behavioral.state.model;

public class Computer {
    State state;

    public Computer() {
        state = new DesktopState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
