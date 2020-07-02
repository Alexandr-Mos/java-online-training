package my.home.module4_class_and_object.simple_class.cl09;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;
	private int booksCounter;

	public Library() {
		this.books = new ArrayList<Book>();
		this.booksCounter = 0;
	}

	public ArrayList<Book> getBooksByAuthor(String author) {
		ArrayList<Book> authorBooks = new ArrayList<Book>();

		for (Book b : books) {
			if (b.getAuthors().contains(author)) {
				authorBooks.add(b);
			}
		}
		return authorBooks;
	}

	public ArrayList<Book> getBooksByPublisher(String publisher) {
		ArrayList<Book> publisherBooks = new ArrayList<Book>();

		for (Book b : books) {
			if (b.getPublisher().toLowerCase().equals(publisher.toLowerCase())) {
				publisherBooks.add(b);
			}
		}
		return publisherBooks;
	}

	public ArrayList<Book> getBooksByYear(int afterYear) {
		ArrayList<Book> booksByYear = new ArrayList<Book>();

		for (Book b : books) {
			if (b.getYear() > afterYear) {
				booksByYear.add(b);
			}
		}
		return booksByYear;
	}

	public void addBook(Book b) {
		incrementCounter();
		b.setId(getBooksCounter());
		books.add(b);
	}

	private void incrementCounter() {
		this.booksCounter++;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public int getBooksCounter() {
		return booksCounter;
	}

	@Override
	public String toString() {
		return "Library [books=" + books + "]";
	}

}
