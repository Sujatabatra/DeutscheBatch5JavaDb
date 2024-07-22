package com.sujata.setdemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemoClass {

	public static void main(String[] args) {
		
/*
 * Unique ordered collection of objects, 
 * and the collection dynamic and is autogrowable and auto shrinkable
 */
		LinkedHashSet<Integer> collection=new LinkedHashSet<>();
		
		System.out.println("Size of collection "+collection.size());
		collection.add(10);
		collection.add(20);
		collection.add(40);
		collection.add(100);
		
		System.out.println("Size of collection "+collection.size());
		System.out.println(collection);
		
		collection.add(20);
		collection.add(140);
		collection.add(150);
		
		System.out.println("Size of collection "+collection.size());
		System.out.println(collection);
		
		collection.remove(10);
		
		System.out.println("Size of collection "+collection.size());
		System.out.println(collection);
		for(Integer element:collection) {
			System.out.println(element);
		}
		
	}

}
