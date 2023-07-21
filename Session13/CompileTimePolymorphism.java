class GoogleAuthentication{
	
	// Method Overloading :)
	
	void login(String email, String password) {
		System.out.println("Login with email and password");
	}
	
	// Error: The method cannot be created with same name
	//		  Signature cannot be same :)
	/*
	void login(String emailID, String pass) {
		System.out.println("Logging In...");
	}
	*/
	
	void login(String phone, int otp) {
		System.out.println("Login with Phone and OTP");
	}
	
}

class PaymentMethod{
	void pay(int amount, String upi) {
		System.out.println("Paying with UPI...");
	}
	
	void pay(int amount, long cardNumber, int cvv, String date, int cardType) {
		System.out.println("Pay By Card...");
	}
	
	void pay(String username, String password, String bank) {
		System.out.println("Paying Online...");
	}
}


public class CompileTimePolymorphism {

	public static void main(String[] args) {
		
		GoogleAuthentication auth = new GoogleAuthentication();
		auth.login("john@example.com", "john123");
		auth.login("+91 99999 11111", 3027);
	}

}
