package com.sujata.client;

import java.util.Scanner;

import com.sujata.presentation.SharePresentation;
import com.sujata.presentation.SharePresentationImpl;

public class ShareManagementClient {

	public static void main(String[] args) {
		SharePresentation sharePresentation=new SharePresentationImpl();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			sharePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			sharePresentation.performMenu(choice);
			
		}

	}

}
