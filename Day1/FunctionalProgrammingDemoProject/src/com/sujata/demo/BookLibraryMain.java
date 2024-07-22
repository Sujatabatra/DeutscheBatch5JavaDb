package com.sujata.demo;

import java.util.ArrayList;

public class BookLibraryMain {

	public static void main(String[] args) {

		BookLibrary bookLibrary = new BookLibrary();

		System.out.println(bookLibrary.getAllBooks());

//		System.out.println(bookLibrary.getBooksWrittenByAuthorA());
//
//		System.out.println(bookLibrary.getExpensiveBooks());

		ArrayList<Book> searchExpensiveBook = bookLibrary.searchBooksByCriteria(new BookPredicate() {

			@Override
			public boolean test(Book book) {

				return book.getPrice() > 1500;
			}
		});

		ArrayList<Book> searchThickBook = bookLibrary.searchBooksByCriteria(new BookPredicate() {

			@Override
			public boolean test(Book book) {

				return book.getNoOfPages() > 2500;
			}
		});
		
		System.out.println(searchExpensiveBook);

	}

}
