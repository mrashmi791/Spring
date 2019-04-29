package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class RetriveRecord {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
	
		Properties properties = new Properties();
		properties.load(new FileInputStream("database.properties"));
	
		String driverClass = properties.getProperty("database.drv");
		String url = properties.getProperty("database.url");
		String uname = properties.getProperty("database.username");
		String pwd = properties.getProperty("database.password");
		String query = properties.getProperty("database.query");
		
		Class.forName(driverClass);
		Connection connection = DriverManager.getConnection(url,uname,pwd);
		
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);
		
		while(rs.next()) {
			
			System.out.println(rs.getString(1)+" "+ rs.getString(2) +" "+ rs.getString(3));
		}
		
		
	}

}
