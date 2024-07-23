package com.sujata.structural.decorator;

public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Sprots Car");
	}

	
}
