package com.practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("employee servlet");

		//int id = Integer.parseInt(request.getParameter("id"));
		String id = request.getParameter("id");
		System.out.println("employee id"+ id);
		String name = request.getParameter("name");
		System.out.println("employee name"+ name);
		String salary = request.getParameter("salary");
		System.out.println("employee salary");
		//int salary = Integer.parseInt(request.getParameter("salary"));
		String gender = request.getParameter("gender");
		
		String address = request.getParameter("address");
		
		
		Employee employee = new Employee();
		System.out.println("employee object class enter");
		employee.setId(Integer.parseInt(id));
		//employee.setId(id);
		
		System.out.println("employee id");
		employee.setName(name);
		System.out.println("employee name");
		employee.setSalary(Integer.parseInt(salary));
		System.out.println("employee salary");
		employee.setGender(gender);
		employee.setAddress(address);
		
		EmployeeService employeeService = new EmployeeService();
		int count= employeeService.save(employee);
		
		if(count > 0) {
			request.setAttribute("emp", employee);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("empstore.jsp");
			requestDispatcher.forward(request,response);
		} else {
			 request.getRequestDispatcher("error.jsp");
		}
	}

}
