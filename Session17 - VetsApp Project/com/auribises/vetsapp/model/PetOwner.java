package com.auribises.vetsapp.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Object is super class of all the classes in Java

/*
 	create table PetOwner(
 		oid int primary key auto_increment,
 		name text,
 		phone text,
 		email text,
 		address text,
 		gender text,
 		age int,
 		createdOn datetime
 	);
 	
 */

public class PetOwner{ //extends Object{

	// Attributes:
	public int oid;
	public String name;
	public String phone;
	public String email;
	public String gender;
	public int age;
	public String createdOn;
	
	public PetOwner() {
	
	}

	public PetOwner(int oid, String name, String phone, String email, String gender, int age) {
		this.oid = oid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public void readData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Pet Owner Name: ");
		name = scanner.nextLine();
		
		System.out.println("Enter Pet Owner Phone: ");
		phone = scanner.nextLine();
		
		System.out.println("Enter Pet Owner Email: ");
		email = scanner.nextLine();
		
		System.out.println("Enter Pet Owner Gender: ");
		gender = scanner.nextLine();
		
		System.out.println("Enter Pet Owner Age: ");
		age = scanner.nextInt();
		
	}
	
	public String getInsertSql() {
		
		Date date = new Date();		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		createdOn = sdf.format(date);		
		
		String sql = "insert into PetOwner values(null, '"+name+"', '"+phone+"', '"+email+
				"', '"+gender+"', "+age+", '"+createdOn+"')";
		return sql;
	}
	
	@Override
	public String toString() {
		return "PetOwner [oid=" + oid + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
