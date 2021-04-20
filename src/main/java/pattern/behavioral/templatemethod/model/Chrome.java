package pattern.behavioral.templatemethod.model;

public class Chrome extends Network {
    @Override
    public void open() {
        System.out.println("Open google chrome");
        System.out.println("Open site");
    }

    @Override
    public void send(String event) {
        System.out.println("Send event data " + event);
    }

    @Override
    public void close() {
        System.out.println("Close browser");
    }
}
