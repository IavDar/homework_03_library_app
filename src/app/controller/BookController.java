package app.controller;

import app.domain.Book;
import app.service.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookController {
    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    public Book getByIndex(int index) {
        return service.getByIndex(index);
    }
}
