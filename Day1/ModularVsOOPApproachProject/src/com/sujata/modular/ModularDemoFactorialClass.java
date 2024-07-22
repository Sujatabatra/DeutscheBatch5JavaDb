package com.sujata.modular;

public class ModularDemoFactorialClass {

	//data
	static int number,factorial;
	
	static void inputNumber(int n) {
		number=n;
	}
	
	static void displayFactorial() {
		System.out.println("Factorial : "+factorial);
	}
	
	static void calculateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}
	public static void main(String[] args) {
		
		inputNumber(5);
		calculateFactorial();
		//logical error
		factorial=0;
		displayFactorial();

	}

}
