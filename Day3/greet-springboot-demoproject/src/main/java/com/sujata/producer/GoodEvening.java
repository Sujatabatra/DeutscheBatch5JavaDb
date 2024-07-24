package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ge")
public class GoodEvening implements Greet {

	//dependency
	
	private String name;
	
	
	public GoodEvening(@Value("Riddhi")String name) {
		super();
		this.name = name;
	}


	@Override
	public void wish() {
		System.out.println("Good Evening "+name);

	}

}
