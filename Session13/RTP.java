
class Cab{
	
	int baseFare;
	int farePerKm;
	
	Cab(){
		baseFare = 50;
		farePerKm = 10;
		System.out.println("[Cab] Object Constructed..");
	}
	
	void bookCab(String fromLocation, String toLocation, int kms) {
		System.out.println("--------CAB--------");
		System.out.println("Cab Booked from "+fromLocation+" to "+toLocation);
		System.out.println("Please Pay: \u20b9"+(baseFare + farePerKm*kms));
		System.out.println("--------CAB--------");
	}
}

class MiniCab extends Cab{
	
	boolean wifiAccess;
	int waterBottles;
	
	MiniCab(){
		baseFare = 70;
		farePerKm = 12;
		wifiAccess = false;
		waterBottles = 1;
		System.out.println("[MiniCab] Object Constructed..");
	}
	
	// Method Overriding
	void bookCab(String fromLocation, String toLocation, int kms) {
		System.out.println("--------MINI--------");
		System.out.println("Mini Cab Booked from "+fromLocation+" to "+toLocation);
		System.out.println("Please Pay: \u20b9"+(baseFare + farePerKm*kms));
		System.out.println("Wifi Access: "+wifiAccess);
		System.out.println("Water Bottles: "+waterBottles);
		System.out.println("--------MINI--------");
	}
}

class SedanCab extends Cab{
	
	String wifiUserName;
	String wifiPassword;
	boolean isTabAccessAvailable;
	int waterBottles;
	
	SedanCab(){
		baseFare = 70;
		farePerKm = 12;
		wifiUserName = "abc";
		wifiPassword = "abc123";
		waterBottles = 5;
		System.out.println("[SedanCab] Object Constructed..");
	}
	
	// Method Overriding
	void bookCab(String fromLocation, String toLocation, int kms) {
		System.out.println("--------SEDAN--------");
		System.out.println("SedanCab Cab Booked from "+fromLocation+" to "+toLocation);
		System.out.println("Please Pay: \u20b9"+(baseFare + farePerKm*kms));
		System.out.println("Wifi Access: "+wifiUserName+" "+wifiPassword);
		System.out.println("Water Bottles: "+waterBottles);
		System.out.println("--------SEDAN--------");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		//Cab cab;
		//cab = new Cab();
		//cab.bookCab("Home", "Work", 3);
		
		// Reference Variable of Parent can refer to the Child Object
		Cab cab;
		//cab = new MiniCab();
		cab = new SedanCab();
		
		cab.bookCab("Home", "Mall", 7);
		
	}

}
