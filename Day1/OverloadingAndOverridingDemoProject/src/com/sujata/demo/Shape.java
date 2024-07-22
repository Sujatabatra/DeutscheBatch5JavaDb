package com.sujata.demo;

public class Shape {

	public void area(int l,int b) {
		int a=l*b;
		System.out.println("Area of Rectangle : "+a);
	}
	
	public void area(int side) {
		int a=side*side;
		System.out.println("Area of Square : "+a);
	}
	
	public void area(double radius) {
		double a=Math.PI*radius*radius;
		System.out.println("Area of Circle : "+a);
	}
	
}
