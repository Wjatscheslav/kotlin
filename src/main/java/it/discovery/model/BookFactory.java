package it.discovery.model;

public class BookFactory {

    public static Book createBook(BookState bookState) {
        return new Book(bookState);
    }
}
