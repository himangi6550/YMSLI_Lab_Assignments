package com.java8.case_study1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Book_lab {
	private static List<Book> loadAllBooks(){
		List<Book> books=new ArrayList<>();
		List<Author> authors1=Arrays.asList(
				new Author("raj","gupta","in"),
				new Author("ekta","gupta","in"));
		List<Author> authors2=Arrays.asList(
				new Author("gunika","gupta","in")
				);
		List<Author> authors3=Arrays.asList(
				new Author("gunika","gupta","in"),
				new Author("keshav","gupta","in"));
		books.add(new Book("java",authors1,300,Subject.JAVA,2021,"1213"));
		books.add(new Book("adv java",authors1,900,Subject.JAVA,2012,"1253"));
		books.add(new Book("adv C#",authors2,600,Subject.DOT_NET,2022,"1299"));
		books.add(new Book("C# basics",authors3,480,Subject.DOT_NET,2016,"1513"));
		
		return books;
	}
	public static void main(String[] args) {
		List<Book> allBooks = loadAllBooks();
		
		// 1. Find books with more then 400 pages
//		allBooks
//		.stream()
//		.filter(b->b.getPages()>=400)
//		.forEach(System.out::println);

		
		// 2. Find all books that are java books and more then 400 pages
//		Predicate<Book> p1= b-> b.getPages()>=400;
//		Predicate<Book> p2= b-> b.getSubject()==Subject.JAVA;
//		allBooks
//		.stream()
//		.filter(p1.and(p2))
//		.forEach(System.out::println);
		
		
		
		// 3. We need the top three longest books
//		allBooks
//		.stream()
//		.sorted(Comparator.comparing(Book::getPages).reversed())
////		.sorted((b1,b2)->Integer.compare(b2.getPages(), b1.getPages()))
//		.limit(3)
//		.collect(Collectors.toList())
//		.forEach(System.out::println);
		
		
		
		// 4. We need from the fourth to the last longest books

//		allBooks
//		.stream()
//		.filter(b->b.getPages()>=400)
//		.sorted(Comparator.comparing(Book::getPages))
//		.skip(2)
//		.forEach(System.out::println);
		
		
		
		// 5. We need to get all the publishing years
		
//		allBooks
//		.stream()
//		.map(b-> b.getYear())
//		.distinct()
//		.forEach(System.out::println);
		
		
		
		// print all the authors
		
//		allBooks
//		.stream()
//		.flatMap(b->b.getAuthors().stream())
//		.map(a->a.getName())
//		.distinct()
//		.forEach(System.out::println);
		
		
		
		// 6. We need all the authors names who have written a book	
		
//		allBooks
//		.stream()
//		.flatMap(b->b.getAuthors().stream())
//		.map(a->a.getName())
//		.distinct()
//		.forEach(System.out::println);
		
		
		
		
		// We want to know if all the books are written by more than one author? boolean

//		System.out.println(allBooks
//				.stream()
//				.allMatch(b->b.getAuthors().size()>1));
		
		
		
		
		//is all the elements of array are odd?
		
//		int[] arr= {469,29,67,33,9889};
//		System.out.println(Arrays.stream(arr).allMatch(i-> i%2!=0));
		
		
		
		
		
		// We want one of the books written by more than one author.? (findAny)
		
//		Optional<Book> books=allBooks
//		.stream()
//		.filter(b->b.getAuthors().size()>1)
//		.findAny();
//		System.out.println(books.orElse(null));

		
		
		// want the most recent published book
		
		
//		Optional<Book> recentBook=allBooks
//				                    .stream()
//				                    .min(Comparator.comparingInt(Book::getYear));
//		String name=recentBook.map(b->b.getTitle()).orElse("not found");
//		System.out.println(name);
										
			
		
		// We want the average number of pages of the books
		
//		Double avgPages=allBooks
//		.stream()
//		.collect(Collectors.averagingInt(Book::getPages));
//
//		System.out.println(avgPages);
		
		
		
		// We want to know how many pages the longest book has.
		
//		int pages=allBooks
//		.stream()
//		.max(Comparator.comparing(Book::getPages))
//		.map(b->b.getPages())
//		.orElse(-1);
//		
//		System.out.println(pages);

		
		
		// We want all the titles of the books
		
//		allBooks
//		.stream()
//		.map(b->b.getTitle())
//		.forEach(System.out::println);

		
		//all tiles print : java , adv c#, 
		
//		String titles=allBooks.stream()
//		.map(b->b.getTitle())
//		.collect(Collectors.joining(" , "));
//		System.out.println(titles);
				   
		
		
		// We want the book with the higher number of authors?
		
		Book noOfAuthors=allBooks.stream()
		.max((b1,b2)->Integer.compare(b1.getAuthors().size(), b2.getAuthors().size()))
		.orElse(null);
		
		System.out.println(noOfAuthors);
		

		
		// We want a Map of book per year.
		
//		Map<Integer, List<Book>> map = allBooks
//		.stream()
//		.collect(Collectors.groupingBy(Book::getYear));
//		
//		map.entrySet().stream().forEach(
//				entry->	{
//			System.out.println(entry.getKey());
//			entry.getValue().forEach(b-> System.out.println(b));
//			});
//				
//
//		System.out.println(map);
		
		
		
		
		//We want a Map of book per year and then by subject
		Map<Integer, Map<Subject, List<Book>>> map = allBooks
				.stream()
				.collect(
						Collectors.groupingBy(Book::getYear,
						Collectors.groupingBy(Book::getSubject)));
				
				map.entrySet().stream().forEach(
						entry->	{
					System.out.println(entry.getKey());
					((Collection<Entry<Integer,Map<Subject,List<Book>>>>) entry2).stream()
					.forEach(
							entry2->
							System.out.println(entry.getKey()));	
							entry2.getValue().forEach(b-> System.out.println(b));
					});
						

				System.out.println(map);
		
				
				
				// We want to count how many books are published per year.
				
				
	}
	
	}
}
