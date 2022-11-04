package com.customer;

public class Customer {
	private int id;
	private String email;
	private String phone;
	private String username;
	private String password;
	
	public Customer(int id, String email, String phone, String username, String password) {
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	
	
}
