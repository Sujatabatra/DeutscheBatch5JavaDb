package com.sujata.demo;

import java.util.ArrayList;

public class BookLibrary {

	private ArrayList<Book> books=new ArrayList<>();
	
	public BookLibrary() {
		books.add(new Book(1, "Book1", "Author A", 1600, 2100));
		books.add(new Book(2, "Book2", "Author A", 1000, 1100));
		books.add(new Book(3, "Book3", "Author B", 850, 2000));
		books.add(new Book(4, "Book4", "Author A", 6500, 4500));
		books.add(new Book(5, "Book5", "Author B", 1700, 2800));
	}
	
	
	public ArrayList<Book> getAllBooks(){
		return books;
	}
	
	public ArrayList<Book> getBooksWrittenByAuthorA(){
		ArrayList<Book> searchedList=new ArrayList<>();
		for(Book book:books) {
			if(book.getAuthorName().equals("Author A"))
				searchedList.add(book);
		}
		return searchedList;
	}
	
	public ArrayList<Book> getExpensiveBooks(){
		ArrayList<Book> searchedList=new ArrayList<>();
		for(Book book:books) {
			if(book.getPrice()>1500)
				searchedList.add(book);
		}
		return searchedList;
	}
	
	//argument to a function can be function itself : behaviour paramerization
	public ArrayList<Book> searchBooksByCriteria(BookPredicate bookPredicate){
		ArrayList<Book> searchedList=new ArrayList<>();
		for(Book book:books) {
			if(bookPredicate.test(book))  //different test method
				searchedList.add(book);
		}
		return searchedList;
	}
	
}
