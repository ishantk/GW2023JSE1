// abstract class is used for Abstraction
// You as developer cannot create its objects :)
/*
 abstract class GooglePay{
	
	boolean isBankInterfaceUp = true;

	void pay(int amount) {
		if(isBankInterfaceUp) {
			System.out.println("[GooglePay]: Paying through UPI...");
			System.out.println("[GooglePay]: Please Wait...");
			System.out.println("[GooglePay]: Amount Paid: \u20b9"+amount);
			success("Payment Done...");
		}else {
			System.out.println("[GooglePay]: Bank is Currently non Responsive");
			failure("Payment Failed...");
		}
	}

	
	// abstract method has no definition
	// abstract method is a RULE
	// abstract method can only be created inside an abstract class
	abstract void success(String message);
	abstract void failure(String message);
}


abstract class PayTM{

	void pay(int amount) {
		System.out.println("[PayTM]: Paying through UPI...");
		System.out.println("[PayTM]: Please Wait...");
		System.out.println("[PayTM]: Amount Paid: \u20b9"+amount);
			
	}
	
	abstract void success(String message);
	abstract void error(String message);
}

*/

// interface is just like abstract class
// it cannot have objects
// it is always implemented rather extends
interface GooglePay{
	
	boolean isBankInterfaceUp = true;

	// In Interfaces, you can define only default methods :)
	default void pay(int amount) {
		if(isBankInterfaceUp) {
			System.out.println("[GooglePay]: Paying through UPI...");
			System.out.println("[GooglePay]: Please Wait...");
			System.out.println("[GooglePay]: Amount Paid: \u20b9"+amount);
			success("[GooglePay]: Payment Done...");
		}else {
			System.out.println("[GooglePay]: Bank is Currently non Responsive");
			failure("[GooglePay]: Payment Failed...");
		}
	}

	
	// abstract method has no definition
	// abstract method is a RULE
	// abstract method can only be created inside an abstract class or interfaces
	// by default in interfaces, method is public abstract
	public abstract void success(String message);
	void failure(String message);
}

interface PayTM{

	boolean isBankInterfaceUp = true;
	
	default void payUsingPayTM(int amount) {
		if(isBankInterfaceUp) {
			System.out.println("[PayTM]: Paying through UPI...");
			System.out.println("[PayTM]: Please Wait...");
			System.out.println("[PayTM]: Amount Paid: \u20b9"+amount);
			success("[PayTM]: Payment Done...");
		}else {
			System.out.println("[PayTM]: Bank is Currently non Responsive");
			error("[PayTM]: Payment Failed...");
		}
			
	}
	
	void success(String message);
	void error(String message);
}

//class ZomatoPaymentPage extends GooglePay{
// Now, we are not inheriting rather we are implemeting
class ZomatoPaymentPage implements GooglePay, PayTM{
	
	// CallBacks :)
	public void success(String message) {
		System.out.println("[ZomatoPaymentPage]: SUCCESS Message: "+message);
		System.out.println("[ZomatoPaymentPage]: Order Placed Successfully");
	}
	
	public void failure(String message) {
		System.out.println("[ZomatoPaymentPage]: FAILURE Message from GooglePay: "+message);
		System.out.println("[ZomatoPaymentPage]: Please Try Payment Again..");
	}
	
	public void error(String message) {
		System.out.println("[ZomatoPaymentPage]: FAILURE Message from PayTM: "+message);
		System.out.println("[ZomatoPaymentPage]: Please Try Payment Again..");
	}
	
	void payToZomato(int amount, int paymentMethod) {
		// 1. User has to choose, which method to opt :)
		// 2. On Successful Payment Zomato has to place order :)
		
		// Developer of Zomato cannot create its object -> Abstraction
		//GooglePay pay = new GooglePay();
		
		amount += 20;
		amount += 110;
		System.out.println("[ZomatoPaymentPage]: Payment Process Started...");

		if(paymentMethod == 1) {
			pay(amount);
		}else {
			payUsingPayTM(amount);
		}
		
	}
	
}



public class Abstraction {

	public static void main(String[] args) {
		
		ZomatoPaymentPage page = new ZomatoPaymentPage();
		page.payToZomato(1200, 1);
		//page.pay(1200);
		
	}

}
