package pattern.behavioral.state.model;

public class DesktopState extends State {
    public DesktopState(Computer computer) {
        super(computer);
    }

    @Override
    public void pressEnterButton() {
        System.out.println("Open telegram");
        computer.setState(new TelegramState(computer));
    }
}
