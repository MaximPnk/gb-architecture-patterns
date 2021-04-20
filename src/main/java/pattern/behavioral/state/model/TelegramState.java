package pattern.behavioral.state.model;

public class TelegramState extends State {
    public TelegramState(Computer computer) {
        super(computer);
    }

    @Override
    public void pressEnterButton() {
        System.out.println("Open first chat");
        computer.setState(new TelegramChatState(computer));
    }
}
