package pattern.behavioral.templatemethod.model;

public class Telegram extends Network {
    @Override
    public void open() {
        System.out.println("Open telegram");
    }

    @Override
    public void send(String event) {
        System.out.println("Send " + event + " to chat");
    }

    @Override
    public void close() {
        System.out.println("Close telegram");
    }
}
