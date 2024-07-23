package com.sujata.creational.builder;

public class MainComputer {
	
	public static void main(String args[]) {
		Computer computer=new Computer.ComputerBuilder("1 TB", "64GB").setBluetoothEnabled(true).build();
		
		System.out.println(computer);
	}

}
