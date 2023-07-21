class FlightBooking{
	
	String from;
	String to;
	String departureDate;
	int travellers;
	
	FlightBooking(){
		from = "Delhi";
		to = "Bangalore";
		departureDate = "22nd July, 2023";
		travellers = 1;
	}

	FlightBooking(String from, String to, String departureDate, int travellers) {
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.travellers = travellers;
	}
	
	void showFlightBooking() {
		System.out.println("----------One Way---------");
		System.out.println("From: "+from+" To: "+to);
		System.out.println("Departure: "+departureDate);
		System.out.println("Travellers: "+travellers);
		System.out.println("--------------------------");
	}
	
}

/*
class RoundTripBooking{
	
	String from;
	String to;
	String departureDate;
	String returnDate;
	int travellers;
	
	RoundTripBooking(){
		from = "Delhi";
		to = "Bangalore";
		departureDate = "22nd July, 2023";
		returnDate = "25th July, 2023";
		travellers = 1;
	}

	RoundTripBooking(String from, String to, String departureDate, String returnDate, int travellers) {
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.travellers = travellers;
	}
	
	void showFlightBooking() {
		System.out.println("---------Round Trip-------");
		System.out.println("From: "+from+" To: "+to);
		System.out.println("Departure: "+departureDate);
		System.out.println("Travellers: "+travellers);
		System.out.println("--------------------------");
	}
	
}*/


// RoundTripBooking IS-A FlightBooking
class RoundTripBooking extends FlightBooking{
	
	String returnDate;
	
	RoundTripBooking(){
		returnDate = "25th July, 2023";
	}
	
	RoundTripBooking(String from, String to, String departureDate, String returnDate, int travellers) {
		//super(); //-> this will be executed by default
		super(from, to, departureDate, travellers);
		this.returnDate = returnDate;	
	}
	
	// Method Overriding
	void showFlightBooking() {
		System.out.println("---------Round Trip-------");
		System.out.println("From: "+from+" To: "+to);
		System.out.println("Departure: "+departureDate);
		System.out.println("Return: "+returnDate);
		System.out.println("Travellers: "+travellers);
		System.out.println("--------------------------");
	}
	
	
}

public class WhyInheritance {

	public static void main(String[] args) {
		
		//FlightBooking booking = new FlightBooking();
		FlightBooking booking = new FlightBooking("Delhi", "Goa", "25th July, 2023", 2);
		booking.showFlightBooking();
		
		//RoundTripBooking booking1 = new RoundTripBooking();
		RoundTripBooking booking1 = new RoundTripBooking("Bangalore", "Chennai", "25th July, 2023", "30th July, 2023", 5);
		booking1.showFlightBooking();
		
	}

}
