
public class RelationshipMappings {

	public static void main(String[] args) {
		
		Dish[] myDishes = {
				new Dish("Dal", 200, 4.5),
				new Dish("Paneer Do Pyaza", 350, 5.0),
				new Dish("Noodles", 150, 3.5),
				new Dish("Burger", 100, 4.1),
				new Dish("Fries", 90, 4.9)
				
		};
		
		Menu menu = new Menu("Indian Delight", myDishes.length, myDishes);
		
		Restaurant restaurant = new Restaurant("Maharaja Spices", "+91 99999 11111", 
				"Redwood Shores", 4.5, 200, "11:00 to 23:00", menu);
		
		restaurant.show();

	}

}
