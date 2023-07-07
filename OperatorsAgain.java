import java.util.Scanner;

public class OperatorsAgain {

	public static void main(String[] args) {
		// Conditional Operators
		// >, <, >=, <=, ==, !=
		
		int cabFare = 500;
		int eWallet = 500;
		
		System.out.println("Can i book my Cab ? "+(cabFare <= eWallet));
		

		String email = "john@example.com";
		String password = "john123";
		
		System.out.println("Email Login Status: "+ (email == "john@example.com"));
		System.out.println("Password Login Status: "+ (password == "john123"));
	
		int otpSentToUser = 3027;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Received OTP: ");
		int otpReceived = scanner.nextInt();
		
		System.out.println("OTP Matched: "+ (otpSentToUser == otpReceived));
		
		// Logical Operators
		// && || !
		
		System.out.println("Login Status: "+ ( (email == "john@example.com") && (password == "john123") ));
		
	}

}
