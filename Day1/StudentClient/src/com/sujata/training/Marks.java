package com.sujata.training;

import com.sujata.demo.Student;

public class Marks extends Student {

	private int marks1,marks2,marks3;
	
	//Method Overloading
	public void input(int rollNumber,String name,int marks1,int marks2,int marks3) {
		input(rollNumber, name);
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	//Method Overriding
	public void display() {
		super.display();
		System.out.println("Marks1 : "+marks1);
		System.out.println("Marks2 : "+marks2);
		System.out.println("Marks3 : "+marks3);
	}
}
