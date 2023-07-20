
public class Dish {
	
	// Non Static : Belong to Object
	String name;
	private int quantity;
	int price;
	
	// Static: It belongs to class
	static int total;
	
	Dish(){
		total++;
	}

	Dish(String name, int price) {
		this.name = name;
		this.price = price;
		quantity = 1;
		total++;
	}
	
	void show() {
		System.out.println("Name: "+name+" Quantity: "+quantity+" Price: "+price);
		// Property of Object can access property of class
		System.out.println("Total: "+total);
	}
	
	void increment() {
		if(quantity <= 10) {
			quantity++;
			//total++;
		}else {
			System.err.println("Quantity cannot be more than 10");
		}
	}
	
	void decrement() {
		quantity--;
		//total--;
	}
	
	static void showTotal() {
		// Property of Object cannot be accessed by property of class
		//quantity++;
		System.out.println("Total is: "+total);
	}
	
}
