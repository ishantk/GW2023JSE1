
/*
 	
 	Principle of OOPS
		1. Think of Object
		Restaurant: name, phone, email, operatingHours, address, ratings, pricePerPerson
 	
 */


//2. Create its Class i.e. code its representation
// Whatever, we write in class -> BELONGS TO OBJECT :)
//							   -> is property of Object
class Restaurant{
	
	// Attributes: Which are property of Object
	String name;
	String phone;
	String email;
	String operatingHours;
	String address;
	double ratings;
	int pricePerPerson;
	
}

public class OOPS {

	public static void main(String[] args) {
		
		// 3. From the class, create REAL OBJECT in MEMORY ( RAM-Stack Heap Model:) )
		// Object Construction Statement
		Restaurant restaurant1 = new Restaurant();
		// LHS restaurant1: is a Reference Variable which will hold hashcode of Restaurant Object
		// RHS new Restaurant() -> Creating an Object in the RAM
		
		Restaurant restaurant2 = new Restaurant();
		Restaurant restaurant3 = restaurant1; // REFERENCE COPY
		
		System.out.println("restaurant1 is: "+restaurant1);
		System.out.println("restaurant2 is: "+restaurant2);
		System.out.println("restaurant3 is: "+restaurant3);
		
		// Operations on Object
		// 1. Write or Update
		restaurant1.name = "Table By Basant";
		restaurant1.phone = "+91 99999 11111";
		restaurant1.email = "table@basant.com";
		restaurant1.operatingHours = "11:00 to 23:00 hrs";
		restaurant1.address = "FGM, Ludhiana";
		restaurant1.ratings = 4.3;
		restaurant1.pricePerPerson = 200;
		
		restaurant2.name = "Mc Donalds";
		restaurant2.phone = "+91 99999 2222";
		restaurant2.email = "mcd@example.com";
		restaurant2.operatingHours = "10:00 to 23:00 hrs";
		restaurant2.address = "Ansal Plaza, Ludhiana";
		restaurant2.ratings = 4.5;
		restaurant2.pricePerPerson = 100;
		
		// UPDATE
		restaurant3.email = "basant@example.com";
		restaurant3.ratings = 4.75;
		
		restaurant2.address = "MBD Mall, Ludhiana";
		
		// READ OPERATION
		System.out.println("Restaurant1 Details:");
		System.out.println("Name: "+restaurant1.name+" Price Per Person: "+restaurant1.pricePerPerson);
		
		System.out.println("Restaurant2 Details:");
		System.out.println("Name: "+restaurant2.name+" Price Per Person: "+restaurant2.pricePerPerson);
		
		System.out.println("Restaurant3 Details:");
		System.out.println("Name: "+restaurant3.name+" Price Per Person: "+restaurant3.pricePerPerson);
		
		
		// Requesting JVM's Garbage Collector to delete unused Objects automatically
		//System.gc();
		
	}

}
