
class Parent{
	
	Parent(){
		System.out.println("[Parent]: Object Constructed");
	}
	
	public void purchaseBike() {
		System.out.println("[Parent]: Lets buy Bajaj Pulsar");
	}
	
	static void purchaseCar() {
		System.out.println("[Parent]: Lets buy Honda City");
	}
	
}

class Child extends Parent{
	
	Child(){
		System.out.println("[Child]: Object Constructed");
	}
	
	// Method Overriding
	public void purchaseBike() {
		System.out.println("[Child]: Lets buy Royal Enfield");
	}
	
	// Hiding
	static void purchaseCar() {
		System.out.println("[Child]: Lets buy Mahindra Thar");
	}
	
}

public class MethodOveriding {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.purchaseBike();
		
		Child.purchaseCar();
	}

}
