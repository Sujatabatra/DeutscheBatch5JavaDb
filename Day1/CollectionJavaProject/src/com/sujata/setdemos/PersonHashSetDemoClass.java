package com.sujata.setdemos;

import java.util.HashSet;

/*
 * for unique collection of user defined objects:
 * override equals() and hashcode() of Object class in your POJO class
 */
public class PersonHashSetDemoClass {

	public static void main(String[] args) {
		
/*
 * Unique unordered collection of objects, 
 * and the collection dynamic and is autogrowable and auto shrinkable
 */
		HashSet<Person> collection=new HashSet<>();
		
		System.out.println("Size of collection "+collection.size());
		collection.add(new Person(1, "AAAA"));
		collection.add(new Person(2, "BBBB"));
		collection.add(new Person(3, "CCCC"));
		collection.add(new Person(4, "DDDD"));
		
		System.out.println("Size of collection "+collection.size());
		System.out.println(collection);
		
		collection.add(new Person(1, "AAAA"));
		collection.add(new Person(5, "EEEE"));
		collection.add(new Person(6, "FFFF"));
		
		System.out.println("Size of collection "+collection.size());
		System.out.println(collection);
		
		
		for(Person element:collection) {
			System.out.println(element);
		}
		
	}

}
