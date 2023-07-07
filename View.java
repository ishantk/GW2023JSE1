import java.util.Scanner; // Scanner is a Built In class which can be used only after import

public class View {

	public static void main(String[] args) {
		
		// Textual Container
		// String is REFERENCE TYPE
		/*String name = "John"; // John -> String Literal
		String email = "john@example.com";
		
		System.out.println("name is: "+name+" hashcode is: "+name.hashCode());
		System.out.println("email is: "+email+" hashcode is: "+email.hashCode());
		*/
		
		// Scanner Object Construction
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter Your Email: ");
		String email = scanner.nextLine();
		
		System.out.println("Enter Your Age: ");
		int age = scanner.nextInt();
		
		System.out.println("Name is: "+name);
		System.out.println("Email is: "+email);
		System.out.println("Age is: "+age);
		
		// Release the Memory
		scanner.close();
		
	}

}
