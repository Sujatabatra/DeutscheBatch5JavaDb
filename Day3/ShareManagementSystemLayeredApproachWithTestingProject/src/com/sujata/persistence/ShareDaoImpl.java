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

import com.sujata.entity.Share;

public class ShareDaoImpl implements ShareDao {

	@Override
	public ArrayList<Share> getAllRecords() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ArrayList<Share> shares = new ArrayList();
		try {

			File file = new File("resources/DbConnection.properties");
			InputStream inputStream = new FileInputStream(file);

			Properties props = new Properties();

			props.load(inputStream);

			// 1.Connect
			// 1.1 Register the Driver
			Class.forName(props.getProperty("datasource.driverClassName"));

			// 1.2 Connect To DataBase
			connection = DriverManager.getConnection(props.getProperty("datasource.url"),
					props.getProperty("datasource.username"), props.getProperty("datasource.password"));

			// 2.Query
			preparedStatement = connection.prepareStatement("select * from shares");

			// Whenever you will execute DQL statement, always make use of executeQuery()

			ResultSet resultSet = preparedStatement.executeQuery();

			// 3. Process The result
			while (resultSet.next()) {
				int sId = resultSet.getInt("shareId");
				String sName = resultSet.getString("shareName");
				double mPrice = resultSet.getDouble("marketPrice");

				shares.add(new Share(sId, sName, mPrice));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				// 4. close
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return shares;
	}

	@Override
	public int saveRecord(Share share) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ArrayList<Share> shares = new ArrayList();
		int rows = 0;
		try {

			File file = new File("resources/DbConnection.properties");
			InputStream inputStream = new FileInputStream(file);

			Properties props = new Properties();

			props.load(inputStream);

			// 1.Connect
			// 1.1 Register the Driver
			Class.forName(props.getProperty("datasource.driverClassName"));

			// 1.2 Connect To DataBase
			connection = DriverManager.getConnection(props.getProperty("datasource.url"),
					props.getProperty("datasource.username"), props.getProperty("datasource.password"));

			// 2.Query
			preparedStatement = connection.prepareStatement("insert into shares values(?,?,?)");
			preparedStatement.setInt(1, share.getShareId());
			preparedStatement.setString(2, share.getShareName());
			preparedStatement.setDouble(3, share.getMarketPrice());

			// Whenever you will execute DML statement, always make use of executeUpdate()

			rows = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				// 4. close
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return rows;
	}

	@Override
	public Share searchShareByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
