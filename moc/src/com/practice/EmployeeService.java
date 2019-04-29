package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeService {

	public int save(Employee employee) {
		int count = 0;
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/employee_database", "root", "Ankit@123");
			
			String query = "insert into employee_data values(?,?,?,?,?)";
			
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			
			prepareStatement.setInt(1, employee.getId());
			prepareStatement.setString(2, employee.getName());
			prepareStatement.setInt(3, employee.getSalary());
			prepareStatement.setString(4, employee.getGender());
			prepareStatement.setString(5, employee.getAddress());
			
			count = prepareStatement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return count;
	
		
		
	}
}
