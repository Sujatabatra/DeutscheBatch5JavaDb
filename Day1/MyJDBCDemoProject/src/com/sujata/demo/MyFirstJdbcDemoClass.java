package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFirstJdbcDemoClass {

	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try {
			//1.Connect
			//1.1 Register the Driver
			Class.forName("oracle.jdbc.OracleDriver");
			
			//1.2 Connect To DataBase
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "sujata");
			
			//2.Query
			preparedStatement=connection.prepareStatement("select * from shares");
			
			//Whenever you will execute DQL statement, always make use of executeQuery()
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
			//3. Process The result
			while(resultSet.next()) {
				int sId=resultSet.getInt("shareId");
				String sName=resultSet.getString("shareName");
				double mPrice=resultSet.getDouble("marketPrice");
				
				System.out.println(sId+" "+sName+" "+mPrice);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
