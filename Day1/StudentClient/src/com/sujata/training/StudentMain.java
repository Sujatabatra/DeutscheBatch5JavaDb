package com.sujata.training;

import com.sujata.demo.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.input(1, "ABCV");
		student.display();
		
		System.out.println("=================");
		
		Marks marks=new Marks();
		marks.input(101, "Amit",89,90,67);
		marks.display();
		
		System.out.println("===================");
		//Dynamic Method Dispatch
		/*
		 * Base class Reference Variable is type compatible with devired class, but reverse is not true
		 * 
		 * ClassName object; (Reference variable)
		 * object =new Constructor() (Object)
		 * 
		 */
		
		//reference variable
		Student student2;
		
		student2=new Marks(); 
		student2.display();   //display() from Marks gets the call, because student2 contains Marks Object
		
		System.out.println("=============");
		student2=new Student();
		student2.display();   //display() from Student gets the call, because student2 contains Student Object
		
		
	}

}
