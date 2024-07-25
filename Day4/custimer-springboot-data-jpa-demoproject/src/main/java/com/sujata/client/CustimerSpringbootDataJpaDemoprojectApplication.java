package com.sujata.client;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.presentation.CustomerPresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class CustimerSpringbootDataJpaDemoprojectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(CustimerSpringbootDataJpaDemoprojectApplication.class, args);
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
