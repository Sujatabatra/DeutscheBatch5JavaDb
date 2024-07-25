package com.sujata.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.entity.Customer;
import com.sujata.service.CustomerService;



@Component
public class CustomerPresentationImpl implements CustomerPresentation {


	private CustomerService customerService;
	
	public CustomerPresentationImpl(@Autowired CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@Override
	public void showMenu() {
		System.out.println("Customer Record System");
		System.out.println("1. Search Customer Details By ID");
		System.out.println("2. Exit");
		System.out.println("================================");

	}

	@Override
	public void performMenu(int choice) {
		
		Scanner scanner=new Scanner(System.in);
		
		switch (choice) {
		case 1: 
			System.out.println("Enter Customer id : ");
			String cId=scanner.next();
			ArrayList<Customer> customers=customerService.searchByCustomerID(cId);
			System.out.println(customers.size());
			customers.stream().forEach(customer->System.out.println(customer));
			break;
		case 2:
			System.out.println("Thanks for using our System, Hope to see you again soon!");
			System.exit(0);

		default:
			System.out.println("Invalid Choice");
		}

	}

}
