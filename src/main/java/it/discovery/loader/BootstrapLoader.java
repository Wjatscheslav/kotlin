package it.discovery.loader;

import it.discovery.model.Book;
import it.discovery.model.BookFactory;
import it.discovery.model.BookState;
import it.discovery.model.Genre;
import it.discovery.service.MainBookService;

import java.time.LocalDateTime;
import java.util.List;

public class BootstrapLoader {

    public static void main(String[] args) {
        MainBookService service = new MainBookService();
        Book book = BookFactory.createBook(BookState.PRESENT);
        book.setName("Introduction into Spring");
        book.setPages(100);
        book.setYear(2016);

        Genre genre = new Genre("IT", LocalDateTime.now());
        book.setGenre(genre);

        service.saveBook(book);

        List<Book> books = service.findBooks();
        System.out.println(books);
    }

}
