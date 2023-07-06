
public class SVC {

	public static void main(String[] args) {

		// Single Value Containers
		
		// 1. Integral
		
		// CREATE Operation
		// 2 power 8 -> 256
		// 256/2 => -128 to 0 to 127
		byte age = 10; // the value 10 is known as LITERAL
		byte johnsAge = 10;
		
		// UPDATE Operation
		age = 22;
		
		short fionnasAge = 30; // 16 bits
		
		int numberOfStudents = 30; // 32 bits
		
		long phoneNumber = 9915571177L; // 64 bits
		
		// CASTING : UpCasting and DownCasting
		
		// UpCasting :)
		int myAge = fionnasAge;
		myAge = 256;
		
		// DownCasting :)
		byte yourAge = (byte)myAge;
		
		// READ Operation
		System.out.println("YourAge is: "+yourAge);
		
		
		// 2. Floating Point
		float pi = 3.14F; // 32 bits
		
		double taxes = 0.18; // 64 bits
		
		// 3. character
		char ch = 'A';
		System.out.println("1. ch is: "+ch);
		
		ch = 66;
		System.out.println("2. ch is: "+ch);
		
		ch = '\u20b9';
		System.out.println("3. ch is: "+ch);
		
		//Logical
		boolean internet = true;
		System.out.println("Is internet connected: "+internet);
		
		
		
	}

}
