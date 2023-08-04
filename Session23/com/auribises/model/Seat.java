package com.auribises.model;

public class Seat {
	
	public char row;
	public int seatNumber;
	public String type;
	public int price;
	public boolean isBooked; // false
	public String email; // null
	
	public Seat() {
		// TODO Auto-generated constructor stub
	}

	public Seat(char row, int seatNumber, String type, int price) {
		this.row = row;
		this.seatNumber = seatNumber;
		this.type = type;
		this.price = price;
		isBooked = false;
		email = "";
	}
	
	public void show() {
		System.out.print("["+row+""+seatNumber+"]  ");
	}
	
	public void showBooked() {
		System.out.println("`````````````````````````");
		System.out.print("["+row+""+seatNumber+"]  ");
		System.out.println("Booked For: "+email);
		System.out.println("`````````````````````````");
	}
	
}
