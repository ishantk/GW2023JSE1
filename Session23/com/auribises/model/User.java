package com.auribises.model;

public class User {

	public String name;
	public String email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void show() {
		System.out.println("User: "+name+" | "+email);
	}
}
