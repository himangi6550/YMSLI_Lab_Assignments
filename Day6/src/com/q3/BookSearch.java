package com.q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {
	String title;
	String author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;

	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [title=").append(title).append(", author=").append(author).append("]");
		return builder.toString();
	}

}

class BookCollection {
	String nameOfOwner;
	List<Book> books = new ArrayList<>();

	public BookCollection(String nameOfOwner, List<Book> books) {
		super();
		this.nameOfOwner = nameOfOwner;
		this.books = books;
	}

	public boolean hasBook(Book b) {
		for (Book book : books) {
			if (book.getTitle().contentEquals(b.getTitle()) && book.getAuthor().contentEquals(b.getAuthor()))
				return true;
		}
		return false;
	}

	public void sort() {
		Collections.sort(books, new BookSorting());
		for (Book book : books) {
			System.out.println(book);
		}
	}
}

class BookSorting implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		int val = (b1.getTitle().toLowerCase()).compareTo(b2.getTitle().toLowerCase());
		if (val == 0)
			val = (b1.getAuthor().toLowerCase()).compareTo(b2.getAuthor().toLowerCase());
		return val;
	}
}

public class BookSearch {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		Book b1 = new Book("HeadFirst Java", "Kathy");
		Book b2 = new Book("Thinking in Java", "Bruce Eckel");
		Book b3 = new Book("Effective Java", "Joshua Bloch");
//		Book b4 = new Book("Java in Depth","Josh Garg");
		books.add(b1);
		books.add(b2);
		books.add(b3);
//		books.add(b4);
		BookCollection collection = new BookCollection("Riya", books);

		System.out.println(collection.hasBook(new Book("Java in Depth", "Josh Garg")));
		collection.sort();
	}
}