
// Think of an Object
// Dish: name, price, ratings

// Code its class
class Dish{
	
	// Attributes:
	String name;
	int price;
	double ratings;
	
	// Methods:
	
	// Constructor: Used for giving default values to attributes
	// Default Constructor or No Arg Constructor
	Dish(){
		name="NA";
		price=0;
		ratings=3.0;
	}

	// Parameterized Constructor or Arg Constructor
	Dish(String name, int price, double ratings){
		this.name = name;
		this.price = price;
		this.ratings = ratings;
	}
	
	// Method
	
	void update(String name, int price, double ratings) {
		this.name = name;
		this.price = price;
		this.ratings = ratings;
	}
	
	void show() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("NAME: "+name);
		System.out.println("PRICE: \u20b9"+price);
		System.out.println("RATINGS: "+ratings);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}

public class OOPSAgain {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish();
		Dish dish2 = new Dish("Noodles", 250, 4.5);
		Dish dish3 = new Dish("Burger", 100, 3.75);
		
		System.out.println("dish1 is: "+dish1);
		System.out.println("dish2 is: "+dish2);
		
		dish1.update("Fries", 90, 4.6);
		
		dish1.show();
		dish2.show();
		dish3.show();

	}

}
