package com.sujata.demo;

public class Student {

	private int rollNumber;
	private String name;
	
	public void input(int rollNumber,String name) {
		this.rollNumber=rollNumber;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Roll Number : "+rollNumber);
		System.out.println("Name : "+name);
	}
}
