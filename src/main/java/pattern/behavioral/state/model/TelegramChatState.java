package pattern.behavioral.state.model;

public class TelegramChatState extends State {
    public TelegramChatState(Computer computer) {
        super(computer);
    }

    @Override
    public void pressEnterButton() {
        System.out.println("Send message");
    }
}
