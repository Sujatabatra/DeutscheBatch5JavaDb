package com.sujata.structural.bridge;

public class MainShape {

	public static void main(String[] args) {
		Shape s1=new Triangle(new RedColor());
		s1.applyColor();

	}

}
