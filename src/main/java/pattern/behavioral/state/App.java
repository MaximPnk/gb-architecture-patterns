package pattern.behavioral.state;

import pattern.behavioral.state.model.Computer;

public class App {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.getState().pressEnterButton();
        computer.getState().pressEnterButton();
        computer.getState().pressEnterButton();
        computer.getState().pressEnterButton();
    }
}
