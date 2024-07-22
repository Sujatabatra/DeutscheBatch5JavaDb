package com.sujata.oop;

/*
 * Whenever we create class:
 * 1. Create private Input and Output Variables
 * 2. Check which variable is readable and which one is modifiable.
 * 2. We need to create public setters for modifiable variables
 * 3. We need to create public getters for readbale variables
 */
public class Factorial {

	//Modifiable : number (setter)
	//Readable : factorial (getter)
	private int number,factorial;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
	
	
	private void calculateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}
	
}

