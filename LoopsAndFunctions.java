
public class LoopsAndFunctions {

	public static void printNumber(int startFrom) {
		
		System.out.println(startFrom);
		startFrom++;
		if(startFrom <= 10) { // TERMINATION CONDITION
			printNumber(startFrom); // RECURSION :)
		}

	}
	
	
	public static void main(String[] args) {
		
		printNumber(1);

		
	}

}
