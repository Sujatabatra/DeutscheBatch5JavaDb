package com.sujata.client;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.presentation.SharePresentation;

/*
 * @Configuration
 * @ComponentScan
 */
@SpringBootApplication(scanBasePackages = "com.sujata")
public class ShareSpringbootDemoprojectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(ShareSpringbootDemoprojectApplication.class, args);
		
		SharePresentation sharePresentation=(SharePresentation)springContainer.getBean("sharePresentationImpl");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			sharePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			sharePresentation.performMenu(choice);
			
		}
	}

}
