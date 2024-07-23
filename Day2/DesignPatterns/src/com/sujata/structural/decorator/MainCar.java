package com.sujata.structural.decorator;

public class MainCar {

	public static void main(String[] args) {
		Car car1=new BasicCar();
		Car car2=new BasicCar();
		Car car3=new BasicCar();

		car1.assemble();
		
		car2=new SportsCar(car2);
		car2.assemble();
		
	}

}
