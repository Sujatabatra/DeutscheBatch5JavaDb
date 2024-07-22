package com.sujata.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MySecondDemoProject {

	
	public static void divide(int number1,int number2) {
		
		try {
			System.out.println("inside try block");
			int result=number1/number2;
			System.out.println("Result : "+result);
			
			System.out.println("Good Bye from try Block");
			return;
		}
		catch(ArithmeticException ex) {
			System.out.println("undefined");
		}
		finally {
			System.out.println("Hi I am finally block");
		}
		
		System.out.println("Good Bye from divide method");
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter first number : ");
			int number1=scanner.nextInt();
			
			System.out.println("Enter second number : ");
			int number2=scanner.nextInt();
			
			divide(number1, number2);
		}
		catch (InputMismatchException e) {
			System.out.println("You entered character , instead of number, please try again");
		}
		
		System.out.println("Good Bye from main");

	}

}
