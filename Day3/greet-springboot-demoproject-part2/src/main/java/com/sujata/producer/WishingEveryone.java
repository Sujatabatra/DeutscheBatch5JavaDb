package com.sujata.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class WishingEveryone {

	/*
	 * when @Autowire is having multiple candidates to be autowired,
	 * we can pick one with the @Qualifier
	 * and in our case Greet interface have two implementation classes , i.e two candidates can be autowired
	 * so we picked one with @Qualifier
	 */
	//dependency
	
	private Greet greet;
	
	public WishingEveryone(Greet greet) {
		super();
		this.greet = greet;
	}


	public void wish() {
		greet.wish();
	}
}
