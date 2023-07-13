
public class Menu {

	String name;
	int numOfDishes;
	Dish[] dishes; // 1 to many => Array of Objects :)
	
	Menu(){
		
	}

	Menu(String name, int numOfDishes, Dish[] dishes) {
		this.name = name;
		this.numOfDishes = numOfDishes;
		this.dishes = dishes;
	}
	
	void show() {
		System.out.println("********MENU********");
		System.out.println(name+" | "+numOfDishes);
		System.out.println("********************");
		
		// Display Dish Array :)
		for(int idx=0;idx<dishes.length;idx++) {
			dishes[idx].show();
		}
	}
	
}
