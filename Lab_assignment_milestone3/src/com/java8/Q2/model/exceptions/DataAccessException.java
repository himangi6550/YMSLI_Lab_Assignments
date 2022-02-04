package com.java8.Q2.model.exceptions;


public class DataAccessException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DataAccessException(Throwable cause) {
		super(cause);
	}
}
	