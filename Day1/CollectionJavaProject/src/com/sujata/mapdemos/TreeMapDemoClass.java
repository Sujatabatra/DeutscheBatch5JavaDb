package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemoClass {

	public static void main(String[] args) {
		/*
		 * Sorted Key- value pair of objects ,
		 * where Objects can be unique and values can be duplicated
		 * Sorting wrt keys 
		 */
		Map<String, Integer> months=new TreeMap<>();
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		
		System.out.println(months);
		
		months.put("Feb", 29);
		System.out.println(months);
		

	}

}
