package app.service;

import app.domain.Book;
import app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class BookServiceImpl implements BookService{
    private BookRepository repository;
    private String bookShelf;

    public BookServiceImpl(BookRepository repository,
                           @Value("${placeOnShelf.shelf}") String bookShelf
    ) {
        this.repository = repository;
        this.bookShelf = bookShelf;
    }

    @Override
    public Book getByIndex(int index) {
        Book book = repository.getByIndex(index);
        setShelf(book);
        return book;
    }
    private void setShelf(Book book) {
        String placeOnShelf = String.format("%s-%s-%d",
                bookShelf, book.getTitle().charAt(0), book.getId());
        book.setPlaceOnShelf(placeOnShelf);

    }
}
