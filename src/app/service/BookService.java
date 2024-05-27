package app.service;

import app.domain.Book;

public interface BookService {
    Book getByIndex(int index);
}
