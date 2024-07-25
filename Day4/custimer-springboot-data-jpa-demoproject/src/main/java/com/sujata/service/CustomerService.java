package com.sujata.service;

import java.util.ArrayList;

import com.sujata.entity.Customer;


public interface CustomerService {

	public ArrayList<Customer> searchByCustomerID(String customerId);
	
	
}
