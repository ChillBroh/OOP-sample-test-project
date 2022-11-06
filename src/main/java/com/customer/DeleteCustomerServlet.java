package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/deletecustomer")
public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		CustomerDBUtill cus = new CustomerDBUtill();
		boolean isTrue = cus.deletecustomer(id);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("customerinsert.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Customer> cusDetails = cus.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
			
		}
		
	}

}
