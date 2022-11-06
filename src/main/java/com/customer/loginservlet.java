package com.customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/login")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		

		
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		
		CustomerDBUtill cusdb = new CustomerDBUtill();
		boolean isTrue = cusdb.validatenew(username, password);
		
		if(isTrue == true) {
			try {
				List<Customer> cusDetails = cusdb.validate(username, password); 
				request.setAttribute("cusDetails", cusDetails);
				
				RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
				dis.forward(request, response);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='login.jsp'");
			out.println("</script>");
		}
	}

}
