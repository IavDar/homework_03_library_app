package app.repository;

import app.domain.Book;

public interface BookRepository {
    Book getByIndex(int index);
}
