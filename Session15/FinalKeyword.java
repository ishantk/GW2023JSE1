
final class GooglePay{
	final void pay(int amount) {
		System.out.println("Google Pay: Amount Paid: "+amount);
	}
}


class ZomatoPaymentPage{ //extends GooglePay{
	/*void pay(int amount) {
		amount += 10;
		System.out.println("Zomato Pay: Amount Paid: "+amount);
	}*/
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		int age = 30;
		System.out.println("age is: "+age);
		age = 32;
		System.out.println("age now is: "+age);
		
		// Final Variable :)
		final int code = 101;
		//code = 102; //error

		// Blank Final Variable :)
		final int rollNumber;
		rollNumber = 111;
		//rollNumber = 121; // error
		
		ZomatoPaymentPage page = new ZomatoPaymentPage();
		//page.pay(2000);
		
	}

}
