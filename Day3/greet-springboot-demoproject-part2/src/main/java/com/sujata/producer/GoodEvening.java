package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class GoodEvening implements Greet {

	//dependency
	
	private String name;
	
	
	public GoodEvening(String name) {
		super();
		this.name = name;
	}


	@Override
	public void wish() {
		System.out.println("Good Evening "+name);

	}

}
