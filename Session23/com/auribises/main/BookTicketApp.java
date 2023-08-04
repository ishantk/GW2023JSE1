package com.auribises.main;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.auribises.controller.BookTicketTask;
import com.auribises.model.MovieHall;
import com.auribises.model.Seat;
import com.auribises.model.User;

public class BookTicketApp {

	public static void main(String[] args) {
		
		Seat seat1 = new Seat('A', 1, "VIP", 500);
		Seat seat2 = new Seat('A', 2, "VIP", 500);
		Seat seat3 = new Seat('A', 3, "VIP", 500);
		Seat seat4 = new Seat('A', 4, "VIP", 500);
		Seat seat5 = new Seat('A', 5, "VIP", 500);
		
		ArrayList<Seat> rowA = new ArrayList<Seat>();
		rowA.add(seat1);
		rowA.add(seat2);
		rowA.add(seat3);
		rowA.add(seat4);
		rowA.add(seat5);
		
		ArrayList<Seat> rowB = new ArrayList<Seat>();
		rowB.add(new Seat('B', 1, "Premium", 310));
		rowB.add(new Seat('B', 2, "Premium", 310));
		rowB.add(new Seat('B', 3, "Premium", 310));
		rowB.add(new Seat('B', 4, "Premium", 310));
		rowB.add(new Seat('B', 5, "Premium", 310));
		
		ArrayList<Seat> rowC = new ArrayList<Seat>();
		rowC.add(new Seat('C', 1, "Executive", 290));
		rowC.add(new Seat('C', 2, "Executive", 290));
		rowC.add(new Seat('C', 3, "Executive", 290));
		rowC.add(new Seat('C', 4, "Executive", 290));
		rowC.add(new Seat('C', 5, "Executive", 290));
		
		LinkedHashMap<Character, ArrayList<Seat>> seats = new LinkedHashMap<Character, ArrayList<Seat>>();
		seats.put('A', rowA);
		seats.put('B', rowB);
		seats.put('C', rowC);
		
		
		MovieHall hall = 
				new MovieHall("Cinepolis", "Fun Republic Mall, Andheri (W)", "Gadar 2", seats);
		
		hall.show();
		
		System.out.println();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		User user1 = new User("John", "john@example.com");
		User user2 = new User("Fionna", "fionna@example.com");
		
		Seat seatA2 = hall.seats.get('A').get(1);
		Seat seatC4 = hall.seats.get('C').get(3);
		
		BookTicketTask task1 = new BookTicketTask(user1, seatA2);
		BookTicketTask task2 = new BookTicketTask(user2, seatC4);
		
		//task1.bookTicket();
		//task2.bookTicket();
		
		task1.start();
		task2.start();
		
	}

}
