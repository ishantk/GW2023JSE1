
public class Restaurant {

	String name;
	String phone;
	String address;
	double ratings;
	int pricePerPerson;
	String operatingHours;
	
	// Has-A
	Menu menu; // 1 to 1 mapping -> 1 Restaurant has 1 Menu
	
	Restaurant(){
		
	}

	Restaurant(String name, String phone, String address, double ratings, int pricePerPerson, String operatingHours,
			Menu menu) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.ratings = ratings;
		this.pricePerPerson = pricePerPerson;
		this.operatingHours = operatingHours;
		this.menu = menu;
	}
	
	void show() {
		System.out.println(">>>>>>RESTAURANT>>>>>>>");
		System.out.println(name+" | "+ratings+" "+operatingHours);
		System.out.println(address+" | "+phone);
		System.out.println(pricePerPerson);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		menu.show();
	}
	
	
}
