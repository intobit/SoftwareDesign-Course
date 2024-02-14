package org.se.lab;
import java.util.Set;

public class ValidationProxy implements Service{

    private final Service service;

    public ValidationProxy(Service service) {
        this.service = service;
    }

    @Override
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("book can't be null");
        } else if (book.getId() <= 0) {
            throw new IllegalArgumentException("book id can't be negative");
        } else if (book.getTitle() == null) {
            throw new IllegalArgumentException("book title can't be null");
        } else if (book.getAuthor() == null) {
            throw new IllegalArgumentException("book author can't be null");
        } else {
            service.addBook(book);
        }
    }

    @Override
    public Set<Book> getBooks() {
        return service.getBooks();
    }
}
