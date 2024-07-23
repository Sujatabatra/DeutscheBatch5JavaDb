package com.sujata.creational.factory;

public class ShapeFactory {

	static public Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("circle"))
			return new Circle();
		else if(shape.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		else if(shape.equalsIgnoreCase("sqaure"))
			return new Square();
		else 
			return null;
	}
}
