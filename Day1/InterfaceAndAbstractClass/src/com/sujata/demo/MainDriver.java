package com.sujata.demo;

public class MainDriver {

	public static void main(String[] args) {
		BMW bmw=new BMW("Q5", "Blue");
		Audi audi=new Audi("A8", "Red");
		
		Bajaj bajaj=new Bajaj("Black");
		TVS tvs=new TVS("White");
		
		Driver sonu=new Driver("Sonu");
		Driver monu=new Driver("Monu");
		
		sonu.setVehicle(bmw);
		sonu.drive();
		
		sonu.setVehicle(tvs);
		sonu.drive();

	}

}
