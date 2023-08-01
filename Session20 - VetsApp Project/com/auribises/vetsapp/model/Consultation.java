package com.auribises.vetsapp.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
	    create table Consultation(
	 		cid int primary key auto_increment,
	 		issues text,
	 		medicines text,
	 		weight int,
	 		temperature float,
	 		oid int,
	 		pid int,
	 		createdOn datetime,
	 		FOREIGN KEY (oid) REFERENCES PetOwner(oid),
	 		FOREIGN KEY (pid) REFERENCES Pet(pid)
	 	);
*/
public class Consultation {

	public int cid;
	public String issues;
	public String medicines;
	public int weight;
	public float temperature;
	
	// Reference from the Related Tables
	public int oid;
	public int pid;
	public String createdOn;
	
	public Consultation() {
		
	}

	Consultation(int cid, String issues, String medicines, int weight, float temperature, int oid, int pid,
			String createdOn) {
		this.cid = cid;
		this.issues = issues;
		this.medicines = medicines;
		this.weight = weight;
		this.temperature = temperature;
		this.oid = oid;
		this.pid = pid;
		this.createdOn = createdOn;
	}
	
	public void readData() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Pet Issues: ");
		issues = scanner.nextLine();
		
		System.out.println("Enter Pet Medicines: ");
		medicines = scanner.nextLine();
		
		System.out.println("Enter Pet Weight: ");
		weight = scanner.nextInt();
		
		System.out.println("Enter Pet Temperature: ");
		temperature = scanner.nextFloat();
		
	}

	public String getInsertSql() {
		
		Date date = new Date();		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		createdOn = sdf.format(date);		
		
		String sql = "insert into Consultation values(null, '"+issues+"', '"+medicines+"',"
				+weight+","+temperature+","+oid+", "+pid+", '"+createdOn+"')";
		
		return sql;
	}
	
	public String getSelectSql(int pid) {
		
		String sql = "select * from Consultation";
		
		if(pid != 0) {
			sql = "select * from Consultation where pid = "+pid;
		}
		
		return sql;
	}
	
	public String getUpdateSql() {
				
		String sql = "";
		
		return sql;
	}
	
	
	@Override
	public String toString() {
		return "Consultation [cid=" + cid + ", issues=" + issues + ", medicines=" + medicines + ", weight=" + weight
				+ ", temperature=" + temperature + ", oid=" + oid + ", pid=" + pid + ", createdOn=" + createdOn + "]";
	}
	
}
