package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class CustomerDBUtill {
	
	public List<Customer> validate(String userName, String password){
		
		ArrayList <Customer> customer = new ArrayList<>();
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/hotel";
		String user = "root";
		String pass = "Melisha@9";
				
		
		//validate
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user,pass);
			Statement stmt = con.createStatement();
			
			String sql = "Select * from customer where Username ='"+userName+"' and password = '"+password+"' ";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				int id = rs.getInt(1);
				String email = rs.getString(2);
				String phone = rs.getString(3);
				String User = rs.getString(4);
				String passU = rs.getString(5);
				
				Customer c = new Customer(id, email, phone, User, passU);
				customer.add(c);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return customer;
		
	}
	
	public boolean insertCustomer(String fname, String lname, String email, String username, String password){
		
	boolean isSuccess = false;
	
	//create database connection
	
	String url = "jdbc:mysql://localhost:3306/hotel";
	String user = "root";
	String pass = "Melisha@9";
	
	//insert data
	
	
    return isSuccess;
		
	}

}
































