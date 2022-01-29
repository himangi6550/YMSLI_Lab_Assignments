package com.bookstore.model.service;

import java.util.List;

import com.bookstore.model.exceptions.DaoException;
import com.bookstore.model.persistance.Book;
import com.bookstore.model.persistance.BookDao;
import com.bookstore.model.persistance.BookDaoImpl;

public class BookServiceImpl implements BookService{
	
	private BookDao bookDao;
	

	public BookServiceImpl() {
		bookDao = new BookDaoImpl();
	}

	@Override
	public List<Book> getAllBooks() throws DaoException {
		// TODO Auto-generated method stub
		return bookDao.getAllBooks();
		
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		bookDao.addBook(book);
		return null;
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		bookDao.deleteBook(id);
		
	}

	@Override
	public void updateBook(int id, Book book) {
		// TODO Auto-generated method stub
		bookDao.updateBook(id, book);
	}

	@Override
	public Book getBookById(int id) throws DaoException {
		// TODO Auto-generated method stub
		
		return bookDao.getBookById(id);
	}
	

}
