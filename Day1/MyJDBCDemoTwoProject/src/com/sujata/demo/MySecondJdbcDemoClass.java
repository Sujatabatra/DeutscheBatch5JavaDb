package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MySecondJdbcDemoClass {

	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
			//1.Connect
			//1.1 Register the Driver
			Class.forName("oracle.jdbc.OracleDriver");
			
			//1.2 Connect To DataBase
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "sujata");
			
			//2.Query
			preparedStatement=connection.prepareStatement("insert into shares values(?,?,?)");
			
			System.out.println("Enter Share ID : ");
			int id=scanner.nextInt();
			System.out.println("Enter Share Name  : ");
			String name=scanner.next();
			System.out.println("Enter Market Price : ");
			double mPrice=scanner.nextDouble();
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, mPrice);
			
			
			//Whenever you will execute DML statement, always make use of executeUpdate() 
			
			int rows= preparedStatement.executeUpdate();
			
			//3. Process The result
			if(rows>0) {
				System.out.println("New Share Record added");
			}
			else
				System.out.println("Share Record Not added");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Share Record Not added");
			e.printStackTrace();
		}
		finally {
			try {
				//4. close
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
