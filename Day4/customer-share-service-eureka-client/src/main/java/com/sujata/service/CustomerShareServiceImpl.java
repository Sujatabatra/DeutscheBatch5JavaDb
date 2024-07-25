package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.entity.Customer;
import com.sujata.entity.CustomerShareDetail;
import com.sujata.entity.Customers;
import com.sujata.entity.Share;


@Service
public class CustomerShareServiceImpl implements CustomerShareService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<CustomerShareDetail> getCustomerShareDetailByCustomerId(String id) {
		ArrayList<CustomerShareDetail> customerShareDetails=new ArrayList<>();
		
		Customers customers= restTemplate.getForObject("http://customer-service/customers/v1/"+id, Customers.class);
		for(Customer customer:customers.getCustomers()) {
			Share share=restTemplate.getForObject("http://share-service/shares/v1/"+customer.getShareId(), Share.class);
			
			CustomerShareDetail customerShareDetail=new CustomerShareDetail();
			customerShareDetail.setCustomerId(customer.getCustomerId());
			customerShareDetail.setShareName(share.getShareName());
			customerShareDetail.setQuantity(customer.getQuantity());
			customerShareDetail.setMarketPrice(share.getMarketPrice());
			customerShareDetail.setTotalShareValue(customer.getQuantity()*share.getMarketPrice());
			
			customerShareDetails.add(customerShareDetail);
		}
		return customerShareDetails;
	}

}
