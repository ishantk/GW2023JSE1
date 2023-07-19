
public class StringApp {

	public static void main(String[] args) {
		
		// Strings are Reference Type :)
		String quote = "Search the Candle rather than cursing the darkness";
		System.out.println("quote is: "+quote);
		
		// Interned Strings
		String s1 = "Be Exceptional";
		String s2 = "Be Exceptional";
		
		// Object Construction Statement
		// String Objects 
		String s3 = new String("BE Exceptional");
		String s4 = new String("Be Exceptional");
		
		// s1, s2, s3 and s4 are reference variables
		// they will not show memory addresses, rather they will the data directly
		
		System.out.println("String without toString...");
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		System.out.println("s3 is: "+s3);
		System.out.println("s4 is: "+s4);
		
		System.out.println();
		System.out.println("String with toString...");
		
		System.out.println("s1.toString() is: "+s1.toString());
		System.out.println("s2.toString() is: "+s2.toString());
		System.out.println("s3.toString() is: "+s3.toString());
		System.out.println("s4.toString() is: "+s4.toString());
		
		
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4) {
			System.out.println("s3 == s4");
		}else{
			System.out.println("s3 != s4");
		}
		
		if(s1 == s3) {
			System.out.println("s1 == s3");
		}else{
			System.out.println("s1 != s3");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1 equals s2");
		}else{
			System.out.println("s1 not equals s2");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3 equals s4");
		}else{
			System.out.println("s3 not equals s4");
		}
		
		
		if(s1.equals(s3)) {
			System.out.println("s1 equals s3");
		}else{
			System.out.println("s1 not equals s3");
		}
		
		if(s1.compareTo(s3) == 0) {
			System.out.println("s1 compared to s3");
		}else{
			System.out.println("s1 not compared to s3");
		}
		
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("s1 equals s3");
		}else{
			System.out.println("s1 not equals s3");
		}
		
		if(s1.compareToIgnoreCase(s3) == 0) {
			System.out.println("s1 compared to s3");
		}else{
			System.out.println("s1 not compared to s3");
		}
		
		
	}

}
