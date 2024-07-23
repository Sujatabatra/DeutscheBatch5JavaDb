package com.sujata.structural.decorator;

public class CarDecorator implements Car {

	protected Car car;
	
	
	public CarDecorator(Car car) {
		super();
		this.car = car;
	}


	@Override
	public void assemble() {
		this.car.assemble();

	}

}
