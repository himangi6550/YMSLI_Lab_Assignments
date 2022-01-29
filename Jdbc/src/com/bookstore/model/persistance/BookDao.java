package com.bookstore.model.persistance;

import java.util.List;

import com.bookstore.model.exceptions.DaoException;

public interface  BookDao {
	
	public List<Book> getAllBooks() throws DaoException;
	public void addBook(Book book) ;
	public void deleteBook(int id) ;
	public void updateBook(int id, Book book);
	public Book getBookById(int id) throws DaoException;


}
