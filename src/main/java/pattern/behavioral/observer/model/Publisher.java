package pattern.behavioral.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notify(Object arg) {
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }
}
