package it.discovery.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Book in a library
 *
 * @author morenets
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Book {
	private int id;

	private String name;

	/**
	 * Publishing year
	 */
	private int year;

	/**
	 * Total number of pages
	 */
	private int pages;

	private Genre genre;

	private BookState bookState;

	private LocalDateTime created;

	private LocalDateTime orderDate;

	private int amount;

	public String getGenreName() {
		return Optional.of(genre).map(Genre::getName).orElse("N/A");
	}

	public Book() {
	}

	public Book(BookState bookState) {
		this.bookState = bookState;
	}

	public String getStatus() {
		if (bookState == null) {
			return "Unknown";
		}
		if (bookState == BookState.SOLD_OUT) {
			return "Sold out";
		}
		if (bookState == BookState.ORDERED) {
			return "Ordered at " + orderDate;
		}

		return "Available amount: " + amount;
	}
}
