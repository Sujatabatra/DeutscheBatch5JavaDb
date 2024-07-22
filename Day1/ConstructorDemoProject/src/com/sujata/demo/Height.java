package com.sujata.demo;
/*
 * Constructor are used to initialise variables at the time of object creation
 * 
 * Rules
 * 1. Constructor name must be same as that of your class name
 * 2. Constructor can be argumented as well as non argumented
 * 3. Constructor can exist in any of the scope i.e private,default,protected,public
 * 
 * Note : if our class is constructor challenged i.e don;t have any contructor then 
 * compiler will create one zero argument(default constructor ) for us.
 * 
 * 
 */
public class Height {

	private int feet,inches;

	//Constructor Overloading
	public Height() {
		feet=1;
		inches=2;
	}
	
	
	public Height(int feet, int inches) {
		super();
		this.feet = feet;
		this.inches = inches;
	}


	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}
	
	public void display() {
		System.out.println("Height is :"+feet+" feets "+inches+" inches");
	}
}
