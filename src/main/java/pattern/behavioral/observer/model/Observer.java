package pattern.behavioral.observer.model;

public interface Observer {
    void update(Publisher subject, Object arg);
}
