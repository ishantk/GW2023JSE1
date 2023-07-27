package com.auribises.vetsapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

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
			result = statement.executeUpdate(sql);
			System.out.println("3. SQL Executed "+sql);
		} catch (Exception e) {
			System.out.println("[DBHelper] Something Went Wrong: "+e);
		}
		
		return result;
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
