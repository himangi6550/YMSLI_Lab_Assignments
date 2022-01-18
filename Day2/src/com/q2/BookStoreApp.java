package com.q2;

import java.util.Scanner;

public class BookStoreApp {
	public static void main(String[] args) {
		
		BookStore bookstore=new BookStore();
		Scanner sc=new Scanner(System.in);
		int option;
		while(true) {
			//Scanner sc=new Scanner(System.in);
		System.out.println("Enter “1”, to display the Books: Title – Author – ISBN - Quantity.\r\n" + 
				"Enter “2”, to order new books.\r\n" + 
				"Enter “3”, to sell books. \r\n" + 
				"Enter “0”, to exit the system.");
		
		option=sc.nextInt();
		if(option==1)
			bookstore.display();
		else if(option==2)
		{
			int flag=1;
			while(flag!=0) {
				System.out.println("Enter Book Title: ");
				String bookTitle=sc.next();
				System.out.println("Enter no. of copies: ");
				int noOfCopies=sc.nextInt();
				bookstore.sell(bookTitle, noOfCopies);
				System.out.println("Want to order another book? (Yes/No):");
				String response=sc.next();
				if(!response.equals("Yes"))
					flag=0;
					
			}
			
		}
		else if(option==3) {
			int flag=1;
			while(flag!=0) {
				System.out.println("Enter ISBN: ");
				String isbn=sc.next();
				System.out.println("Enter no. of copies: ");
				int noOfCopies=sc.nextInt();
				bookstore.order(isbn, noOfCopies);
				System.out.println("Want to order another book? (Y/N):");
				//sc.nextLine();
				String response=sc.next();
				if(response.equals("No"))
					flag=0;
					
			}
		}
		else
			{
			System.exit(0);
			}
		//sc.close();
	}
	}

}
