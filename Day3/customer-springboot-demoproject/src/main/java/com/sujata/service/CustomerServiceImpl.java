package com.sujata.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.entity.Customer;
import com.sujata.persistence.CustomerDao;



@Component
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerDao customerDao;
	
	public void setShareDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public ArrayList<Customer> searchByCustomerID(String customerId) {
		
		return customerDao.getRecordsByCustomerId(customerId);
	}

	

}
