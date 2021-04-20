package pattern.behavioral.templatemethod.model;

public abstract class Network {

    public void sendData(String event) {
        open();
        send(event);
        close();
    }

    protected abstract void open();
    protected abstract void send(String event);
    protected abstract void close();
}
