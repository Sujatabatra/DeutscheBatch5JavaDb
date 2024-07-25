package com.sujata.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sujata.entity.Customer;
import com.sujata.persistence.CustomerDao;
import com.sujata.service.CustomerService;
import com.sujata.service.CustomerServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class CustomerServiceApplicationTests {

	
	@Mock
	private CustomerDao customerDao;
	
	@InjectMocks
	private CustomerServiceImpl customerService;
	
	@Test
	void testCase() {
		
		ArrayList<Customer> customers=new ArrayList<>();
		customers.add(new Customer(1, "C1", 1, "Intraday", 5));
		customers.add(new Customer(2, "C1", 2, "Intraday", 15));
		
		when(customerDao.findCustomerByCustomerId("C1")).thenReturn(customers);
		
		ArrayList<Customer> customerList=customerService.searchByCustomerID("C1");
		
		assertTrue(customerList.size()>0);
	}

}
