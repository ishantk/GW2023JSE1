
public class Dish {

	String name;
	int price;
	double ratings;
	
	Dish(){
		
	}
	
	Dish(String name, int price, double ratings) {
		this.name = name;
		this.price = price;
		this.ratings = ratings;
	}
	
	void show() {
		System.out.println("--------DISH---------");
		System.out.println(name+" | "+price);
		System.out.println("Ratings: "+ratings);
		System.out.println("----------------------");
	}
	
	
}
