package com.sujata.structural.bridge;



public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.print("Rectangle is filled with color ");
		getColor().applyColor();

	}

}
