package com.bookstore.model.service;

import java.util.List;

import com.bookstore.model.exceptions.DaoException;
import com.bookstore.model.persistance.Book;

public interface BookService {
	public List<Book> getAllBooks() throws DaoException;
	public Book addBook(Book book) ;
	public void deleteBook(int id) ;
	public void updateBook(int id, Book book);
	public Book getBookById(int id) throws DaoException;


}
