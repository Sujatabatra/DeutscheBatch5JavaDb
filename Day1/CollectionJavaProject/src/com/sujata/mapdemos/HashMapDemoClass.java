package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemoClass {

	public static void main(String[] args) {
		/*
		 * Unordered Key- value pair of objects ,
		 * where Objects can be unique and values can be duplicated
		 * unordering wrt keys 
		 */
		Map<String, Integer> months=new HashMap<>();
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		
		System.out.println(months);
		
		months.put("Feb", 29);
		System.out.println(months);
		
		months.put(null, null);
		System.out.println(months);
		
		months.put(null, 20);
		System.out.println(months);
		

	}

}
