package com.q2;

public class Book {

	String bookTitle;
	String author;
	String ISBN;
	int numOfCopies;

	Book(String bookTitle, String author, String ISBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void display() {
		System.out.println(bookTitle + " – " + author + " – " + ISBN + " – " + numOfCopies);
	}

}
