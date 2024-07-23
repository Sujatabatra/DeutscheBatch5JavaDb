package com.sujata.demo;

/*
 * Abstract class : can't be instantiated i.e we can't create object of abstract class
 * Abstract class is like partial contract with child classes that common functionality parent class is doing, but if child class want to
 * make use of that functionality
 * only if child class fulfil the contract which is coming to the child class in the form of abstract method
 * 
 * if my class is having a single abstract method then its mandatory to mark class as abstract
 */
abstract public class Car implements Running {

	private String model,color;
	
	
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}




}
