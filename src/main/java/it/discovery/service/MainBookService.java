package it.discovery.service;

import it.discovery.model.Book;
import it.discovery.repository.DBBookRepository;

import java.util.List;

public class MainBookService {
	private final DBBookRepository repository =
			new DBBookRepository();

	public MainBookService() {
		System.out.println("Using db repository");
	}

	public void saveBook(Book book) {
		repository.saveBook(book);
	}

	public Book findBookById(int id) {
		return repository.findBookById(id);
	}

	public List<Book> findBooks() {
		return repository.findBooks();
	}
}
