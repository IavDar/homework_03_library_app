package app.repository;

import app.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class BookRepositoryList implements BookRepository {

    private final List<Book> database = new ArrayList<>();

    public BookRepositoryList() {
        database.add(0, new Book(1L, "The Great Gatsby", "F. Scott Fitzgerald", 1925 ));
        database.add(1, new Book(2L, "One Hundred Years of Solitude", "Gabriel Garcia Marquez", 1967));
        database.add(2, new Book(3L, "One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
    }

    @Override
    public Book getByIndex(int index) {
        return database.get(index);
    }
}
