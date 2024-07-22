package com.sujata.demo;

import java.util.Scanner;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		/*
		 * In try block, we keep the statements where we expect exceptions might can come
		 * If exception raised in any of the statement of try block
		 * control will go to catch handler to handle exception
		 * if specific handler exists exception will be handled by that specific handler otherwise will be handled by generic handler
		 * 
		 * We can have any number of specific handlers(i.e specific exception catch block)
		 * and at the end can have generic exception handler(i.e catch with argument type as Exception)
		 * 
		 */
		try {
		System.out.println("Enter First Number : ");
		int number1=scanner.nextInt();
		
		System.out.println("Enter Second Number : ");
		int number2=scanner.nextInt();
		
		int result=number1/number2;
		
		System.out.println("Result : "+result);
		
		}
		//Exception Handler
		catch(ArithmeticException ex) {
			System.out.println("undefined");
		}
		//Generic Exception Handler
		catch (Exception e) {
			System.out.println("Something went wrong , please try again");
		}
		System.out.println("Good Bye from Main");
		 

	}

}
