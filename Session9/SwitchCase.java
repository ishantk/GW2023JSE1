import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		final int olaMicro = 1;
		int olaMini = 2;
		int olaSedan = 3;
		int olaBike = 4;
		
		System.out.println("1: olaMicro 2: olaMini 3: olaSedan 4: olaBike");
		System.out.println("Select Type of Cab");
		
		Scanner scanner = new Scanner(System.in);
		int typeOfCab = scanner.nextInt();
		scanner.close();

		// Ladder if/else
		/*if(typeOfCab == olaMicro) {
			System.out.println("OLA Micro Booked...");
		}else if(typeOfCab == olaMini) {
			System.out.println("OLA Mini Booked...");
		}else if(typeOfCab == olaSedan) {
			System.out.println("OLA Sedan Booked...");
		}else if(typeOfCab == olaBike) {
			System.out.println("OLA Bike Booked...");
		}else {
			System.out.println("Invalid Choice...");
		}*/
		
		switch(typeOfCab) {
			case olaMicro:
				System.out.println("OLA Micro Booked...");
				break;
				
			case 2:
				System.out.println("OLA Mini Booked...");
				break;
				
			case 3:
				System.out.println("OLA Sedan Booked...");
				break;
			
			case 4:
				System.out.println("OLA Bike Booked...");
				break;
				
			default:
				System.out.println("Invalid Choice...");
				break;
		}
		
		
		
	}

}
