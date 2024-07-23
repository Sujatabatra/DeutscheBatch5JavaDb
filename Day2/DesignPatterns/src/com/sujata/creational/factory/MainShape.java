package com.sujata.creational.factory;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Shape : ");
		String shapeName=scanner.next();
		
		Shape shape=ShapeFactory.getShape(shapeName);
		if(shape!=null)
			shape.draw();
		else
			System.out.println("No Such shape exist");

	}

}
