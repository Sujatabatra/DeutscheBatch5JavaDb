package com.sujata.structural.bridge;

public abstract class Shape {

	private Color color;

	public Shape(Color color) {
		super();
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

	abstract public void applyColor();
}
