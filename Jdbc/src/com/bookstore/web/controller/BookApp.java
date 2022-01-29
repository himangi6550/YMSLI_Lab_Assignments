package com.bookstore.web.controller;

import java.util.List;

import com.bookstore.model.persistance.Book;
import com.bookstore.model.service.BookService;
import com.bookstore.model.service.BookServiceImpl;

public class BookApp {
	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		
		//Displaying all the books in store
//		List<Book> books=bookService.getAllBooks();
//		for(Book book: books) {
//			System.out.println(book);
//		}
		
		//Adding new books
//		System.out.println("add new book");
//		Book newBook=new Book("thj7tcd","Let us C","gjjkk",987.89);
//		bookService.addBook(newBook);
		
		//Retrieving book by Id
		System.out.println("get by id");
		System.out.println(bookService.getBookById(1));
		
		//Updating book details
		Book newBook1=new Book(1,"tty8u","Let us C","gjjkk",1045.9);
		bookService.updateBook(1, newBook1);
		
		List<Book> books=bookService.getAllBooks();
		for(Book book: books) {
			System.out.println(book);
		}
		
		//Deleting a record 
//		bookService.deleteBook(2);
	}

}
