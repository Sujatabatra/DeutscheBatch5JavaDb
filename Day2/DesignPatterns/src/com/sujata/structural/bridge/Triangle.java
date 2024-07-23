package com.sujata.structural.bridge;



public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle is filled with color ");
		getColor().applyColor();

	}

}
