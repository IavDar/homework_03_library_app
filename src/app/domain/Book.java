package app.domain;

import java.util.Objects;

public class Book {
    private Long id;
    private String title;
    private String author;
    private Integer yearOfPublication;
    private String placeOnShelf;

    public Book(Long id, String title, String author, Integer yearOfPublication) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setPlaceOnShelf(String placeOnShelf) {
        this.placeOnShelf = placeOnShelf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(yearOfPublication, book.yearOfPublication) && Objects.equals(placeOnShelf, book.placeOnShelf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, yearOfPublication, placeOnShelf);
    }

    @Override
    public String toString() {
        return String.format("Book: id - %d, title - %s, author - %s, yearOfPublication - %d, placeOnShelf -%s",
                id, title, author, yearOfPublication, placeOnShelf);
    }
}
