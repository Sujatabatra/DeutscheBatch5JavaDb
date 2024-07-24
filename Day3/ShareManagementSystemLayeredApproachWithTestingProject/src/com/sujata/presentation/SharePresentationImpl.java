package com.sujata.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.sujata.entity.Share;
import com.sujata.service.ShareService;
import com.sujata.service.ShareServiceImpl;

public class SharePresentationImpl implements SharePresentation {

	//presentation layers is interacting with service layer
	private ShareService shareService=new ShareServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("Share Management System");
		System.out.println("1. Show All Shares Details");
		System.out.println("2. Search Share By Name");
		System.out.println("3. Add new Share");
		System.out.println("4. Exit");
		System.out.println("================================");

	}

	@Override
	public void performMenu(int choice) {
		
		Scanner scanner=new Scanner(System.in);
		
		switch (choice) {
		case 1: 
			
			ArrayList<Share> shares=shareService.getAllShares();
			shares.stream().forEach(share->System.out.println(share));
			
			break;
		case 2: 
			System.out.println("This Module is under development");
			break;
		case 3:
			System.out.println("Enter share id : ");
			int id=scanner.nextInt();
			System.out.println("Enter share name : ");
			String name=scanner.next();
			System.out.println("Enter market price : ");
			double mPrice=scanner.nextDouble();
			if(shareService.insertNewShare(new Share(id, name, mPrice)))
				System.out.println("New Record Inserted");
			else
				System.out.println("New Record Not Inserted");
			break;
		case 4:
			System.out.println("Thanks for using our System, Hope to see you again soon!");
			System.exit(0);

		default:
			System.out.println("Invalid Choice");
		}

	}

}
