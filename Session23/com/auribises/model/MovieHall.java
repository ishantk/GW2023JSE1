package com.auribises.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MovieHall {

	public String name;
	public String address;
	public String movieTitle;
	
	// Has-A | 1 to many
	//public ArrayList<ArrayList<Seat>> seats;
	public LinkedHashMap<Character, ArrayList<Seat>> seats;
	
	public MovieHall() {
		// TODO Auto-generated constructor stub
	}

	public MovieHall(String name, String address, String movieTitle, LinkedHashMap<Character, ArrayList<Seat>> seats) {
		this.name = name;
		this.address = address;
		this.movieTitle = movieTitle;
		this.seats = seats;
	}
	
	public void show() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Name: "+name);
		System.out.println("Location: "+address);
		System.out.println("Movie: "+movieTitle);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		for(char row : seats.keySet()) {
			
			System.out.println(">> "+row);
			System.out.println("----------------------------------");
			
			ArrayList<Seat> seatsInRow = seats.get(row);
			
			for(Seat seat : seatsInRow) {
				seat.show();
			}
			System.out.println();
			System.out.println("----------------------------------");
		}
		
		/*for(ArrayList<Seat> row : seats) {
			
			System.out.println("----------------------------------");
			System.out.println(row.get(0).type);
			for(Seat seat : row) {
				seat.show();
			}
			System.out.println();
			System.out.println("----------------------------------");
			
			System.out.println();
		}*/
	}
	
}
