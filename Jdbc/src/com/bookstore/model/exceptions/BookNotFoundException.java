package com.bookstore.model.exceptions;

public class BookNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6550921276063319411L;
	public BookNotFoundException(String s) {
		super(s);
	}

}
