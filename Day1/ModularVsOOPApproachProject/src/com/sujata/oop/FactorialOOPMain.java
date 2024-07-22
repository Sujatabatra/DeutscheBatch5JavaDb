package com.sujata.oop;

import java.util.Scanner;

public class FactorialOOPMain {

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int number=scanner.nextInt();
		factorial.setNumber(number);
		System.out.println("Factorial : "+factorial.getFactorial());
		
		//Logical Error
//		factorial.factorial=0;
		factorial.setNumber(4);
		System.out.println("Factorial : "+factorial.getFactorial());
		

	}

}
