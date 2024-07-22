package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemoClass {

	public static void main(String[] args) {
		/*
		 * Duplication ordered dynamic indexed collection of elements,
		 * which is autogroable and autoskrinkable
		 */

		List<Integer> collection=new LinkedList<>();
		
		System.out.println("Size of Collection : "+collection.size());
		
		collection.add(10);
		collection.add(20);
		collection.add(100);
		collection.add(105);
		
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		
		collection.add(20);
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(Integer.valueOf(10));
		System.out.println("Size of Collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Traversal using traditional for loop");
		for(int index=0;index<collection.size();index++) {
			System.out.println(collection.get(index));
			
		}
		
		System.out.println("Traversal using for each loop");
		for(Integer element:collection) {
			System.out.println(element);
		}
		
		
		
	}

}
