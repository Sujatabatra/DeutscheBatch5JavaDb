package com.sujata.service;

import java.util.List;

import com.sujata.entity.CustomerShareDetail;

public interface CustomerShareService {
	
	List<CustomerShareDetail> getCustomerShareDetailByCustomerId(String id);

}
