
class Parent{
	
	// Attributes
	String fname;
	String lname;
	int wealth;
	int vehicles;
	private int stocks;
	
	// Constructor
	Parent(){
		fname = "John";
		lname = "Watson";
		wealth = 100000;
		vehicles = 2;
		stocks = 750000;
		System.out.println("[Parent] Object Constructed");
	}

	// Methods
	void show() {
		System.out.println("[Parent] "+fname+" "+lname);
		System.out.println("[Parent] \u20b9"+wealth+" "+vehicles);
	}
	
}

// Inheritance
class Child extends Parent{
	
	String fname;
	int wealth;
	String companyName;
	
	Child(){
		fname = "Fionna";
		wealth = 200000;
		companyName = "ABC Softwares";
		System.out.println("[Child] Object Constructed");
	}
	
	void show() {
		
		//super.wealth -= 30000;
		//super.show();
		
		System.out.println("[Child] "+fname+" "+lname);
		System.out.println("[Child] \u20b9"+wealth+" "+vehicles);
		System.out.println("[Child] "+companyName);
		// System.out.println("[Child] Stocks: "+stocks);
	}
}

public class WhatIsInheritance {

	public static void main(String[] args) {
		
		/*Parent pRef = new Parent();
		//System.out.println("pRef is: "+pRef);
		pRef.show();*/
		
		Child cRef = new Child();
		
		// Rule 1: Whenever we create object of child, 
		// object of parent is constructed automatically before the object of child

		// Rule 2: Child can access any property of Parent, iff child does not have it
		//		   But, if anything is marked as private in Parent, it wont be accessible by child
		cRef.wealth -= 50000;
		cRef.show();
		
	}

}
