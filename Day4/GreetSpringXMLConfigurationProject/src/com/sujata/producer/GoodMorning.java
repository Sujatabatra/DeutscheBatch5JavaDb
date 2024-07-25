package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * you can give component name as well the way i gave gm and
 * if you will not give any name , then the name of the compnent will be same as that of your class name with in camelCase
 */

public class GoodMorning implements Greet {

	//Dependency
	
	private String name;
	
	
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void wish() {
		System.out.println("Good Morning "+name);

	}

}
