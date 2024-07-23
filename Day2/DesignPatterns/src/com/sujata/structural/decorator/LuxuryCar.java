package com.sujata.structural.decorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Luxury Car");
	}

	
}
