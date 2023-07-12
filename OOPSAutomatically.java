// FlightBooking: source, destination, travelDate, numberOfTravelers

class FlightBooking{
	
	String source;
	String destination;
	String travelDate;
	int numberOfTravelers;
	
	public FlightBooking() {
		source = "New Delhi";
		destination = "Bengaluru";
		travelDate = "13th July, 2023";
		numberOfTravelers = 1;
	}

	FlightBooking(String source, String destination, String travelDate, int numberOfTravelers) {
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.numberOfTravelers = numberOfTravelers;
	}
	
	
	void update(String source, String destination, String travelDate, int numberOfTravelers) {
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.numberOfTravelers = numberOfTravelers;
	}
	
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public int getNumberOfTravelers() {
		return numberOfTravelers;
	}

	public void setNumberOfTravelers(int numberOfTravelers) {
		this.numberOfTravelers = numberOfTravelers;
	}

	void show() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("From: "+source+" To: "+destination);
		System.out.println("On: "+travelDate+" For: "+numberOfTravelers+" traveler(s)");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	}
	
}


public class OOPSAutomatically {

	public static void main(String[] args) {
		
		FlightBooking booking1 = new FlightBooking();
		FlightBooking booking2 = new FlightBooking("Bengaluru", "Hyderabad", "13th July, 2023", 1);
		
		//booking1.update("Mumbai", "Pune", "15th July, 2023", 3);
		//booking1.setSource("Kolkata");
		
		booking1.source = "Kolkata";
		booking1.show();
		
		
		//System.out.println("For Booking1, destinition is: "+booking1.getDestination());
		System.out.println("For Booking1, destinition is: "+booking1.destination);
		
		booking2.show();

	}

}
