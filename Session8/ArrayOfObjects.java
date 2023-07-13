
public class ArrayOfObjects {

	public static void main(String[] args) {
		
		/*
		Dish dish1 = new Dish("Dal", 200, 4.5);
		Dish dish2 = new Dish("Paneer Do Pyaza", 350, 5.0);
		Dish dish3 = new Dish("Noodles", 150, 3.5);
		Dish dish4 = new Dish("Burger", 100, 4.1);
		Dish dish5 = new Dish("Fries", 90, 4.9);
		
		int[] array = {10, 20, 30, 40, 50};
		
		// Array of Objects :)
		Dish[] dishes = {dish1, dish2, dish3, dish4, dish5};
		
		System.out.println("dishes: "+dishes); // HashCode
		System.out.println("dishes[0]: "+dishes[0]); // HashCode
		
		//dishes[0].show();
		
		for(int idx=0; idx<dishes.length; idx++) {
			dishes[idx].show();
		}
		
		*/
		
		Dish[] dishes = {
				new Dish("Dal", 200, 4.5),
				new Dish("Paneer Do Pyaza", 350, 5.0),
				new Dish("Noodles", 150, 3.5),
				new Dish("Burger", 100, 4.1),
				new Dish("Fries", 90, 4.9)
				
		};
		
		for(int idx=0; idx<dishes.length; idx++) {
			System.out.println("Index "+idx+" is: "+dishes[idx]);
			dishes[idx].show();
		}
		
	}

}
