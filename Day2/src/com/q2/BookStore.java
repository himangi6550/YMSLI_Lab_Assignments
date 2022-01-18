package com.q2;

import java.util.Scanner;

public class BookStore {
	private Book[] books;
	int numBooks;

	public BookStore() {
		books = new Book[10];
//		numBooks = 0;
	}
	
	public int getNumBooks() {
		return numBooks;
	}

	public void sell(String bookTitle, int noOfCopies) {
		boolean bookFound=false;
		for(int i=0;i<numBooks;i++) {
			if(books[i].getBookTitle().equals(bookTitle)) {
				if(books[i].getNumOfCopies()>=noOfCopies) {
					books[i].setNumOfCopies(books[i].getNumOfCopies()-noOfCopies);
					bookFound=true;
				}
				else
					System.out.println("Insufficient no. of copies");
			}
		}
		if(!bookFound)
			System.out.println("Book with title: "+bookTitle+" is not available.");
		}
		
	
	
	public void order(String isbn, int noOfCopies) {
		boolean bookFound=false;
		for(int i=0;i<numBooks;i++) {
			if(books[i].getISBN().contentEquals(isbn)) {
				//if(books[i].getNumOfCopies()>=noOfCopies) {
					books[i].setNumOfCopies(books[i].getNumOfCopies()+noOfCopies);
					bookFound=true;
				//}
			}
		}
		if(!bookFound) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Book is not available in the store. Add the book");
			System.out.println("Enter Book Title");
			String bookTitle=sc.next();
			System.out.println("Enter Book Author");
			String bookAuthor=sc.next();
			if (numBooks < 10) {
				books[numBooks]=new Book(bookTitle,bookAuthor,isbn,noOfCopies);
				numBooks++;
			} else
				System.out.println("Book no. limit is attained..");
			sc.close();
		}
	}
	
	public void display() {
		for(int i=0;i<numBooks;i++) {
			books[i].display();
		}
	}


}
