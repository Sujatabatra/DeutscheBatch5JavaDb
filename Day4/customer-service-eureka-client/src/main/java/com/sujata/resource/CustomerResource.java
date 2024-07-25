package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.Customers;
import com.sujata.service.CustomerService;

@RestController
public class CustomerResource {

	@Autowired
	CustomerService customerService;
	
	@GetMapping(path = "/customers/v1/{cId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Customers getCustomerByIdResource(@PathVariable("cId") String cId) {
		Customers customers=new Customers();
		customers.setCustomers(customerService.searchByCustomerID(cId));
		return customers;
	}
}
