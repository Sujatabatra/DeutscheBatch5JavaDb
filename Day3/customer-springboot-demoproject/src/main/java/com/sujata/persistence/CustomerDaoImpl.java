package com.sujata.persistence;

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
import java.util.ArrayList;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.config.ConfigProperties;
import com.sujata.entity.Customer;

@Component
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	ConfigProperties configProp;
	
	@Override
	public ArrayList<Customer> getRecordsByCustomerId(String customerId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ArrayList<Customer> customers = new ArrayList();
		try {

			Class.forName(configProp.getConfigValue("datasource.driverClassName"));

			
			connection = DriverManager.getConnection(configProp.getConfigValue("datasource.url"),
					configProp.getConfigValue("datasource.username"), configProp.getConfigValue("datasource.password"));

			// 2.Query
			preparedStatement = connection.prepareStatement("select * from customer where customerid=?");

			preparedStatement.setString(1, customerId);
			// Whenever you will execute DQL statement, always make use of executeQuery()

			ResultSet resultSet = preparedStatement.executeQuery();

			// 3. Process The result
			while (resultSet.next()) {
				int dId = resultSet.getInt("detailId");
				String cId = resultSet.getString("customerId");
				int sId = resultSet.getInt("shareId");
				String sType = resultSet.getString("shareType");
				int qty = resultSet.getInt("quantity");

				customers.add(new Customer(dId, customerId, sId, sType, qty));
					System.out.println(customers);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 4. close
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return customers;
	}

}
