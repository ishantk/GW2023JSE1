package com.auribises.db;

import java.sql.Connection;    // JDBC API
import java.sql.DriverManager; // JDBC API
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 	
 	DataBase :) -> Used for Permanent Storage
 	MySQL
 	
 	Database is collection of tables
 	table is collection of rows/records
 	
 	ORM: Object Relational Mapping
 	Table Structure is same as that of Object Structure
 	
 	
 	SQL Commands
 	-------------
 	show databases;
 	create database gw2023jse1;
 	use gw2023jse1;
 	show tables;
 	
 	create table Customer(
		cid int primary key auto_increment,
		name text,
		phone text unique key,
		email text,
		age int,
		gender text
	);
	
	describe Customer;
	
	To Add a new Row in Table
	insert into Customer values(null, 'Fionna', '+91 99999 22222', 'fionna@example.com', 22, 'female');
	
	To fetch all records
	select * from Customer;
 	
 */

class Customer{
	
	// Attributes
	int cid;
	String name;
	String phone;
	String email;
	int age;
	String gender;
	
	// Constructor - Default
	Customer(){
		
	}

	// Constructor - Parameterized
	Customer(int cid, String name, String phone, String email, int age, String gender) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	
	void readCustomerDetails() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Customer Name: ");
		name = scanner.nextLine();
		
		System.out.println("Enter Customer Phone: ");
		phone = scanner.nextLine();
		
		System.out.println("Enter Customer Email: ");
		email = scanner.nextLine();
		
		System.out.println("Enter Customer Gender: ");
		gender = scanner.nextLine();
		
		System.out.println("Enter Customer Age: ");
		age = scanner.nextInt();
	}
	
	void show() {
		System.out.println("----Customer Details----");
		System.out.println("Name: "+name);
		System.out.println("Phone: "+phone);
		System.out.println("Email: "+email);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("------------------------");
	}
}

public class CustomerManagementApp {

	public static void main(String[] args) {
		
		System.out.println("Customer Management App Started..");
		
		// Object will have data stored in RAM
		// i.e. Temporary Storage
		Customer customer = new Customer();
		//System.out.println("customer is: "+customer);
		customer.readCustomerDetails();
		customer.show();
		
		
		/*
		 
		 	DB Connectivity Steps
		 	
		 	1. Load the Driver
		 		1.1 Download the Driver Library
		 			https://dev.mysql.com/downloads/connector/j/
		 			
		 		1.2 Link it in the Project
		 			Configure > Build Path > Lib > Add ext jar
		 			
		 		1.3 Use Class.forname method to load the Driver
		 
		 	2. Create Connection with DataBase
		 		use JDBC APIs
		 		Connection
		 		DriverManager
		 
		 	3. Create and Execute SQL Statement
		 		use String to create SQL Statement
		 		use Statement API -> JDBC API
		 		
		 	4. Close Connection
		 */
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver Loaded..");
			
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/gw2023jse1";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Created..");
			
			
			//String sql = "insert into Customer values(null, 'George', '+91 99999 22112', 'george@example.com', 27, 'male')";
			String sql = "insert into Customer values(null, '"+customer.name+"', '"+customer.phone+"', '"+customer.email+"', "+customer.age+", '"+customer.gender+"')";
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("3. SQL Executed...");
			}else {
				System.out.println("3. SQL Failed...");
			}
			
		}catch(Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("4. Connection Closed..");
			
		}
		
		
		System.out.println("Customer Management App Finished..");
		
		
	}

}
