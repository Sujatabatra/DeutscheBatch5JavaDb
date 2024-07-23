package com.sujata.creational;

public class MySingletonDemoClass {

	static private MySingletonDemoClass instance=new MySingletonDemoClass();
	
	private MySingletonDemoClass() {
		
	}
	
	public void show() {
		System.out.println("Hi I am show method of MySingletonDemoClass!");
	}

	public static MySingletonDemoClass getInstance() {
		return instance;
	}
	
	
	
	
}
