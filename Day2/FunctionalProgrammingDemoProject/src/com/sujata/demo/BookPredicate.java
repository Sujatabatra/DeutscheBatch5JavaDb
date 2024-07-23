package com.sujata.demo;

@FunctionalInterface
public interface BookPredicate {

	boolean test(Book book);
}
