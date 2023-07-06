import java.util.Arrays;

// In Java, a program is a class
public class MVC {
	
	// a program will have main method within a class
	// whatever we write in main method, is executed one by one
	public static void main(String[] args) {
		
		// Create Operation
		int price = 200;
		
		//int prices = 200, 300, 400, 500, 1200;
		
		// Array
		// Indexing		 0	   1    2    3    4
		int[] prices = {200, 300, 400, 500, 1200};

		System.out.println("price is: "+price);
		
		// prices is a reference variable
		// which holds hashcode of the Array
		System.out.println("prices is: "+prices);
		System.out.println("HashCode of prices is: "+prices.hashCode());
		
		
		
		System.out.println(Arrays.toString(prices));
	}

}
