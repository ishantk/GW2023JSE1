package com.auribises.vetsapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.auribises.vetsapp.model.PetOwner;

// SINGLETON - Design Pattern

public class DBHelper {

	Connection connection;
	Statement statement;
	
	private static DBHelper db = new DBHelper();
	
	public static DBHelper getDB() {
		return db;
	}
	
	
	private DBHelper() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver Loaded..");
			
			createConnection();
			
		} catch (Exception e) {
			System.out.println("[DBHelper] Something Went Wrong: "+e);
		}
		
	}
	
	private void createConnection() {
		try {
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/gw2023jse1";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Created..");
		} catch (Exception e) {
			System.out.println("[DBHelper] Something Went Wrong: "+e);
		}
	}
	
	public int execute(String sql) {
		
		int result = 0;
		
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(sql);	// INSERT | UPDATE | DELETE
			System.out.println("3. SQL Executed "+sql);
		} catch (Exception e) {
			System.out.println("[DBHelper] Something Went Wrong: "+e);
		}
		
		return result;
	}
	
	public PetOwner fetch(String sql) {
		
		PetOwner owner = new PetOwner();
		
		try {
			statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql); // SELECT
			
			while(set.next()) {
				owner.oid = set.getInt("oid");
				owner.name = set.getString("name");
				owner.phone = set.getString("phone");
				owner.email = set.getString("email");
				owner.gender = set.getString("gender");
				owner.age = set.getInt("age");
				owner.createdOn = set.getString("createdOn");
				System.out.println(owner);
			}
			
			System.out.println("3. SQL Executed "+sql);
		} catch (Exception e) {
			System.out.println("[DBHelper] Something Went Wrong: "+e);
		}
		
		return owner;
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println("4. Connection Closed ");
		} catch (Exception e) {
			System.out.println("[DBHelper] Something Went Wrong: "+e);
		}
	}
	
}
