package com.sujata.training;

import java.util.function.BiFunction;

@FunctionalInterface
interface Operation{
	int calculate(int number1,int number2);
//	void show();
}

public class FirstDemoClass {

	public static void main(String[] args) {
		// datatype variablename=function body
		
		//Anonymous inner class (till JDK1.7)
//		Operation sum=new Operation() {
//			@Override
//			public int calculate(int number1, int number2) {
//				return number1+number2;
//			}
//		};

		//jdk1.8 : lambda
//		Operation sum=(number1, number2)-> {
//				return number1+number2;
//			};
		
		Operation sum=(number1,number2)-> number1+number2;
		System.out.println(sum.calculate(10,20));
		
		
		Operation diff=(number1,number2)->number1-number2;
		
		System.out.println(diff.calculate(78, 45));
		
		
		BiFunction<Integer, Integer, Integer> mul=(number1,number2)->number1*number2;
		
		System.out.println(mul.apply(10, 5));
		
	}

}
