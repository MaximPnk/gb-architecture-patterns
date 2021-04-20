package pattern.behavioral.observer;

import pattern.behavioral.observer.model.BookPublisher;
import pattern.behavioral.observer.model.BookSubscriber;
import pattern.behavioral.observer.model.Observer;

public class App {

    public static void main(String[] args) {
        BookPublisher publisher = new BookPublisher();
        System.out.println(publisher.getBooks());
        Observer observer = new BookSubscriber();
        publisher.subscribe(observer);
        publisher.addBook("D");
        System.out.println(publisher.getBooks());
        publisher.unsubscribe(observer);
        publisher.addBook("E");
    }
}
