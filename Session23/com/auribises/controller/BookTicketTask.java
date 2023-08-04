package com.auribises.controller;

import com.auribises.model.Seat;
import com.auribises.model.User;

public class BookTicketTask extends Thread{

	public User user;
	public Seat seat;

	public BookTicketTask(){

	}

	public BookTicketTask(User user, Seat seat) {
		this.user = user;
		this.seat = seat;
	}

	// synchronized method
	//synchronized private void pay() {
	private void pay() {
		System.out.println("[BookTicketTask] [pay] ["+user.name+"] Started..");
		System.out.println("Dear, "+user.name);
		System.out.println("Please Pay \u20b9"+seat.price);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("[BookTicketTask] [pay] ["+user.name+"] Finished..");
	}

	private void attachSeatToUser() {
		System.out.println("[BookTicketTask] [attachSeatToUser] ["+user.name+"] Started..");


		seat.isBooked = true;
		seat.email = user.email;

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Seat Booked Successfully..");
		seat.showBooked();
		System.out.println("[BookTicketTask] [attachSeatToUser] ["+user.name+"] Finsihed..");

		sendEmail();

	}

	private void sendEmail() {

		System.out.println("[BookTicketTask] [sendEmail] ["+user.name+"] Started..");
		String emailContent = "Ticket "+seat.row+" "+seat.seatNumber+" Booked Successfully";
		System.out.println("Email Content: "+emailContent);
		System.out.println("Email Sent to "+user.email);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		seat.showBooked();

		System.out.println("[BookTicketTask] [sendEmail] ["+user.name+"] Finsihed..");

	}

	//public void bookTicket() {
	public void run() {

		// synchronized block
		synchronized (seat) {
			if(!seat.isBooked) {
				System.out.println("[BookTicketTask] [bookTicket] ["+user.name+"] Started..");
				pay();
				attachSeatToUser();
				System.out.println("[BookTicketTask] [bookTicket] ["+user.name+"] Finsihed..");
			}else{
				System.out.println("Sorry, "+user.name+" Seat "+seat.row+" | "+seat.seatNumber+" is already booked...");
			}
		}

	}

}
