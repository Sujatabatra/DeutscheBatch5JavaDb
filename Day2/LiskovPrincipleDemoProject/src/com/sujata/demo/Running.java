package com.sujata.demo;

/*
 * interface : 100% contract , i.e 100% abstract class
 */
public interface Running {

	public void engine();
	public String getColor();
	default public String getModel() {
		return "No Model";
	}
	
}
