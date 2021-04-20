package pattern.behavioral.state.model;

public abstract class State {
    Computer computer;

    public State(Computer computer) {
        this.computer = computer;
    }

    public abstract void pressEnterButton();
}
