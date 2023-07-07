import java.util.Scanner;

public class ConditionalConstructs {

	public static void main(String[] args) {
		
		// Promo Codes
		int WELCOME50 = 1;
		int ZOMPAYTM = 2;
		
		System.out.println("Welcome to Zomato");
		System.out.println("Subway Promo Codes");
		System.out.println("1: WELCOME50");
		System.out.println("2: ZOMPAYTM");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Amount: ");
		double amount = scanner.nextDouble();
		
		System.out.println("Enter Your Desired Promo Code: ");
		int promoCode = scanner.nextInt();
		
		// Regular If/Else
		/*if(promoCode == 1) {
			System.out.println("WELCOME50 Promo Code Applied");
		}else {
			System.out.println("Invalid Promo Code");
		}*/
		
		// Ladder if/else
		/*if(promoCode == 1) {
			System.out.println("WELCOME50 Promo Code Applied");
		}else if (promoCode == 2) {
			System.out.println("ZOMPAYTM Promo Code Applied");
		}else {
			System.out.println("Invalid Promo Code");
		}*/
		
		if(promoCode == 1) {
			// Nested if/else
			if(amount >= 159) {
				System.out.println("WELCOME50 Promo Code Applied");
				double discount = 0.50 * amount;
				if(discount >= 100) {
					discount = 100;
				}
				System.out.println("Please Pay \u20b9"+(amount-discount));
			}else {
				System.out.println("Please Pay \u20b9"+(amount));
			}
			
		}else if (promoCode == 2) {
			// Nested if/else
			if(amount >= 299) {
				System.out.println("ZOMPAYTM Promo Code Applied");
				double discount = 0.20 * amount;
				if(discount >= 50) {
					discount = 50;
				}
				System.out.println("You will get CashBack of \u20b9 25");
				System.out.println("Please Pay \u20b9"+(amount-discount));
			}else {
				System.out.println("Please Pay \u20b9"+(amount));
			}
				
		}else {
			// Assignment: Suggest the right promo code to the user
			System.out.println("Invalid Promo Code");
			System.out.println("Please Pay \u20b9"+(amount));
		}
		
		scanner.close();
	}

}
