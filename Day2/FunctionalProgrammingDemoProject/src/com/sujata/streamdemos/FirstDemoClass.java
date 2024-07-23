package com.sujata.streamdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FirstDemoClass {

	public static void main(String[] args) {
		List<Integer> collection=Arrays.asList(11,21,30,45,50,60);

//		collection.stream().forEach(new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//				
//			}
//		});
		
		collection.stream().forEach(ele->System.out.println(ele));
		
		System.out.println("List of even elements");
		collection.stream()
		.filter(ele->ele%2==0)
		.forEach(element->System.out.println(element));
		
		List<Integer> evenList=collection.stream()
		.filter(ele->ele%2==0)
		.collect(Collectors.toList());
		
		System.out.println(evenList);
		
		
		List<Integer> newList=collection.stream()
				.filter(ele->ele%2!=0)
				.map(ele->ele+5)
				.collect(Collectors.toList());
		
		System.out.println(newList);
	}

}
