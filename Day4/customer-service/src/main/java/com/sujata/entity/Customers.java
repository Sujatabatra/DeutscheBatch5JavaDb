package com.sujata.entity;

import java.util.ArrayList;
import java.util.List;

public class Customers {

	private List<Customer> customers=new ArrayList<>();
	
	public Customers() {
		
	}

	public Customers(List<Customer> customers) {
		super();
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
}
