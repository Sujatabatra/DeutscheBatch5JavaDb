package com.sujata.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MyFirstJdbcDemoClass {

	public static void main(String[] args)  {
		
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		
		try {
		
			File file=new File("resources/DbConnection.properties");
			InputStream inputStream=new FileInputStream(file);
		
			Properties props=new Properties();
			
			props.load(inputStream);
			
			
			//1.Connect
			//1.1 Register the Driver
			Class.forName(props.getProperty("datasource.driverClassName"));
			
			//1.2 Connect To DataBase
			connection=DriverManager.getConnection(props.getProperty("datasource.url"), props.getProperty("datasource.username"), props.getProperty("datasource.password"));
			
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
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
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
