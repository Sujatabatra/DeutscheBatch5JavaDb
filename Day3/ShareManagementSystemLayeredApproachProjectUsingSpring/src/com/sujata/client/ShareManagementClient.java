package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.config.ShareConfig;
import com.sujata.presentation.SharePresentation;
import com.sujata.presentation.SharePresentationImpl;

public class ShareManagementClient {

	public static void main(String[] args) {
		
		//fixing the dependency
//		SharePresentation sharePresentation=new SharePresentationImpl();
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(ShareConfig.class);
		
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
