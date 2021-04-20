package pattern.behavioral.observer.model;

import java.util.ArrayList;
import java.util.List;

public class BookPublisher extends Publisher {
    List<String> books = new ArrayList<>();

    public BookPublisher() {
        books.add("A");
        books.add("B");
        books.add("C");
    }

    public List<String> getBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
        notify(book);
    }
}
