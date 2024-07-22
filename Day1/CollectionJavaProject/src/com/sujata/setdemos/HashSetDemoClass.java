package com.sujata.setdemos;

import java.util.HashSet;

public class HashSetDemoClass {

	public static void main(String[] args) {
		
/*
 * Unique unordered collection of objects, 
 * and the collection dynamic and is autogrowable and auto shrinkable
 */
		HashSet<Integer> collection=new HashSet<>();
		
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
