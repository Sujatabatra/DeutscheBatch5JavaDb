package com.sujata.training;

import java.util.function.Function;

public class SecondClass {

	public static void main(String[] args) {
		
		Function<String,Integer> stLength=new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		
//		Function<String, Integer> strLength=(str)->str.length();
		
		Function<String, Integer> strLength=str->str.length();
		System.out.println("Length of Sujata : "+strLength.apply("Sujata"));
	}
}
