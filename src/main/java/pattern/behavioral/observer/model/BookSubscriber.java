package pattern.behavioral.observer.model;

public class BookSubscriber implements Observer {

    @Override
    public void update(Publisher subject, Object arg) {
        System.out.println("Publisher add new book: " + arg);
    }
}
