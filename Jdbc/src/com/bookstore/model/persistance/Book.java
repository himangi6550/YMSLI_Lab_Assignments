package com.bookstore.model.persistance;

public class Book {
	private int id;
	private String isbn;
	private String title;
	private String author;
	private double price;
	
	public Book(int id, String isbn, String title, String author, double price) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String isbn, String title, String author, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=").append(id).append(", isbn=").append(isbn).append(", title=").append(title)
				.append(", author=").append(author).append(", price=").append(price).append("]");
		return builder.toString();
	}
	
	


}
