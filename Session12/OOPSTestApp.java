
public class OOPSTestApp {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish("Noodles", 200);
		Dish dish2 = new Dish("Burger", 100);
		Dish dish3 = dish1; // Reference Copy
		Dish dish4 = new Dish();
		
		// How many Dish Objects we have created -> 2
		//					  N	 B
		dish1.increment();//  2  1
		dish2.increment();//  2  2
		dish3.increment();//  3  2

		dish1.increment();//  4  2
		dish3.increment();//  5  2
		
		dish1.decrement();//  4  2
		dish2.increment();//  4  3
		dish2.increment();//  4  4
		dish2.increment();//  4  5
		//										 	
		dish1.show(); // Name: Noodles  Quantity: 4 Price: 200 Total: 3
		dish2.show(); // Name: Burger   Quantity: 5 Price: 100 Total: 3
		dish3.show(); // Name: Noodles  Quantity: 4 Price: 200 Total: 3
		dish4.show(); // Name: null     Quantity: 0 Price: 0   Total: 3
		
		dish1.showTotal();
		Dish.showTotal();
		//Dish.show(); // error

	}

}
