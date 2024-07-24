package com.sujata.client;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.presentation.CustomerPresentation;


/*
 * @Configuration
 * @ComponentScan
 */
@SpringBootApplication(scanBasePackages = "com.sujata")
public class CustomerSpringbootDemoprojectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(CustomerSpringbootDemoprojectApplication.class, args);
		
		CustomerPresentation customerPresentation=(CustomerPresentation)springContainer.getBean("customerPresentationImpl");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			customerPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			customerPresentation.performMenu(choice);
			
		}
	}

}
