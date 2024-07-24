package com.sujata.persistence;

import java.util.ArrayList;

import com.sujata.entity.Customer;


public interface CustomerDao {

	public ArrayList<Customer> getRecordsByCustomerId(String customerId);
	
}
