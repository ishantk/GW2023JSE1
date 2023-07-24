import java.util.Scanner;

/*
 		Inheritance
 		
 		
 		Single Level
 		A
 		|
 		B
 		
 		class A{}
 		class B extends A{}
 		
 		Multi Level
 		A
 		|
 		B
 		|
 		C
 		
 		class A{}
 		class B extends A{}
 		class C extends B{}
 	
 	
 		Hierarchy
 		A
 		|
 	B		C
 			|
 		D		E	
 	
 		class A{}
 		class B extends A{}
 		class C extends A{}
 		class D extends C{}
 		class E extends C{}
 		
 		Multiple 
 		A	B
 		  |
 		  C
 		
 		class A{} 
 		class B{}
 		class C extends A,B{} NOT Supported in Java
 		
 	Hybrid
 	Combination of above
 		 
 */


class Plan{
	
	int data;
	int price;
	
	Plan(){
		data = 10;
		price = 300;
	}
	
	void show() {
		System.out.println("Plan >> Data:["+data+" GB] Price:[\u20b9"+price+"]");
	}
}

class Plan3G extends Plan{
	
	int ottAccess;
	
	Plan3G(){
		data = 50;
		price = 500;
		ottAccess = 12;
	}
	
	void show() {
		System.out.println("Plan3G >> Data:["+data+" GB] Price:[\u20b9"+price+"] OTT: ["+ottAccess+"]");
	}
}

class Plan4G extends Plan{
	
	boolean smartTVDevice;
	int ottAccess;
	
	Plan4G(){
		data = 50;
		price = 500;
		smartTVDevice = true;
		ottAccess = 18;
	}
	
	void show() {
		System.out.println("Plan4G >> Data:["+data+" GB] Price:[\u20b9"+price+"] OTT: ["+ottAccess+"]");
		System.out.println("Smart Device: "+smartTVDevice);
	}
}



public class RTP {

	public static void main(String[] args) {
		
		/*Plan plan;
		plan = new Plan();
		plan.show();*/
		
		System.out.println("Buy A Plan..");
		System.out.println("1: Plan 3G");
		System.out.println("2: Plan 4G");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Choice: ");
		int choice = scanner.nextInt();
		
		// Initialization Before Use Principle Error
		Plan plan=null;
		
		if(choice == 1) {
			plan = new Plan3G();
		}else if(choice == 2) {
			plan = new Plan4G();
		}else {
			System.err.println("Invalid Choice..");
		}
		
		if(plan!=null)
			plan.show();
		
	}

}
