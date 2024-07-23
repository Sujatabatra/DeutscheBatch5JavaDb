package com.sujata.demo;

public class Driver {

	private String driverName;
	private Running vehicle;  //liscov substitution principle
	
	
	public Driver(String driverName) {
		super();
		this.driverName = driverName;
	}


	public void setVehicle(Running vehicle) {
		this.vehicle = vehicle;
	}
	
	public void drive() {
		
		System.out.print(driverName+" is driving "+vehicle.getColor()+" "+vehicle.getModel());
		vehicle.engine();
	}
}
