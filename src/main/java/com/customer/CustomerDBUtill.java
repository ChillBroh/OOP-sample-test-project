package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public class CustomerDBUtill {
	boolean isSuccess = false;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public List<Customer> validate(String userName, String password){
		
		ArrayList <Customer> customer = new ArrayList<>();
	
	
		//validate
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "Select * from customer where Username ='"+userName+"' and password = '"+password+"' ";
			
			rs = stmt.executeQuery(sql);
			
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
	
	public boolean insertCustomer(String email,String phone, String username, String password){
		
		
		
		//insert data
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			
			String sql = "insert into customer values (0,'"+email+"','"+phone+"','"+username+"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true; 
				
			}
			else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	    return isSuccess;
			
	}
	
	public boolean updateCustomer(String id,String email, String phone, String username, String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "update customer set email= '"+email+"', phone = '"+phone+"', Username = '"+username+"', password = '"+password+"' where id= '"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public List<Customer> getCustomerDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Customer> cus =  new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from customer where id= '"+convertedID+"'";
			
			rs = stmt.executeQuery(sql);
			      
			while(rs.next()) {
				int id = rs.getInt(1);
				String email = rs.getString(2);
				String phone = rs.getString(3);
				String username = rs.getString(4);
				String password = rs. getString(5);
				
				Customer c = new Customer(id, email, phone, username, password);
				cus.add(c);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return cus;
	}
	
	public boolean deletecustomer(String id) {
		
		int uid = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "delete from customer where id='"+uid+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public boolean validatenew(String username, String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "Select * from customer where Username ='"+username+"' and password = '"+password+"' ";
			
			rs = stmt.executeQuery(sql);
	
		
			if(rs.next()) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}

}
































