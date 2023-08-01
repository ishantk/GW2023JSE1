package com.auribises.vetsapp.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 
 	create table Pet(
 		pid int primary key auto_increment,
 		name text,
 		breed text,
 		gender text,
 		age int,
 		oid int,
 		createdOn datetime,
 		FOREIGN KEY (oid) REFERENCES PetOwner(oid)
 	);
 
 */

public class Pet {

	public int pid;
	public String name;
	public String breed;
	public String gender;
	public int age;
	public int oid;		// Owner ID of the Pet | HAS-A
	public String createdOn;
	
	public Pet() {

	}

	
	Pet(int pid, String name, String breed, String gender, int age, int oid, String createdOn) {
		this.pid = pid;
		this.name = name;
		this.breed = breed;
		this.gender = gender;
		this.age = age;
		this.oid = oid;
		this.createdOn = createdOn;
	}


	public void readData() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Pet Name: ");
		name = scanner.nextLine();
		
		System.out.println("Enter Pet Breed: ");
		breed = scanner.nextLine();
		
		System.out.println("Enter Pet Gender: ");
		gender = scanner.nextLine();
		
		System.out.println("Enter Pet Age: ");
		age = scanner.nextInt();
		
	}
	
	public String getInsertSql() {
		
		Date date = new Date();		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		createdOn = sdf.format(date);		
		
		String sql = "insert into Pet values(null, '"+name+"', '"+breed+"', '"+gender+
				"', "+age+","+oid+", '"+createdOn+"')";
		
		return sql;
	}
	
	public String getSelectSql(int oid, int pid) {
		
		String sql = "select * from Pet";
		
		if(oid != 0) {
			sql = "select * from Pet where oid = "+oid;
		}
		
		if(pid != 0) {
			sql = "select * from Pet where pid = "+pid;
		}
		
		return sql;
	}
	
	public String getUpdateSql() {
				
		
		String sql = "update Pet set name='"+name+"', breed='"+breed
				+"',gender='"+gender+"', age="+age+" where pid = "+pid;
		
		return sql;
	}
	
	public String getDeleteSql() {
		String sql = "delete from Pet where pid = "+pid;
		return sql;
	}


	@Override
	public String toString() {
		return "Pet [pid=" + pid + ", name=" + name + ", breed=" + breed + ", gender=" + gender + ", age=" + age
				+ ", oid=" + oid + ", createdOn=" + createdOn + "]";
	}

	
}
