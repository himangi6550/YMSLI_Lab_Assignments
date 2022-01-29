package com.bookstore.model.persistance;

import java.util.ArrayList;
import java.util.List;

import com.bookstore.model.exceptions.BookNotFoundException;
import com.bookstore.model.exceptions.DaoException;
import java.sql.*;

public class BookDaoImpl implements BookDao{
	
	private Connection connection;
	
	 public BookDaoImpl() {
		connection=ConnectionFactory.getConnection();
	}

	@Override
	public List<Book> getAllBooks() throws DaoException {
		// TODO Auto-generated method stub
		System.out.println("getting all records using jdbc");
		//we will read all the rec from db and put into a arrayList and return to the user
		List<Book> books=new ArrayList<Book>();
		try {
			Book tempBooks=null;
			
			PreparedStatement pstmt=connection.prepareStatement("select * from book");
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				tempBooks=new Book(rs.getInt(1),
						rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
				books.add(tempBooks);
			}
			
		}catch(SQLException ex) {
			throw new DaoException(ex);
		}
		
		return books;
		
	}

	@Override
	public void addBook(Book book){
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt=connection.prepareStatement
					("insert into book(isbn, title, author, price) values(?,?,?,?)");
			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDouble(4, book.getPrice());
			
			pstmt.executeUpdate();
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt=connection.prepareStatement
					("delete from book where id=?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void updateBook(int id, Book book){
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt=connection.prepareStatement
					("update book set price=? where id=?");
			
			pstmt.setDouble(1, book.getPrice());
			pstmt.setInt(2, book.getId());
			
			pstmt.executeUpdate();
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		Book tempBook=null;
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from book where id=?");
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				tempBook=new Book(rs.getInt(1),
						rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
			}
			else
				throw new BookNotFoundException("Book not found");
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return tempBook;
	}

}
