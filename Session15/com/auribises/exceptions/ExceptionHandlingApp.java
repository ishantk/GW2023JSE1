package com.auribises.exceptions;

import java.util.Scanner;

public class ExceptionHandlingApp {

	// Whenever you get run time error -> process will crash
	
	public static void main(String[] args) {
		
		System.out.println("Lucky Numbers App Started...");
		
		// 				   0							     8
		int[] cashBacks = {10, 15, 0, 35, 90, 100, 50, 40, 60};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Lucky Number [1-9]: ");
		int number = scanner.nextInt();
		int cashBack = 0;
		int additionalCashBack=0;
		
		// Exception Handling 
		try {
			cashBack = cashBacks[number-1];
			additionalCashBack = 500/cashBack;
		}/*catch(ArrayIndexOutOfBoundsException ref) {
			System.out.println("Something Went Wrong..."+ref);
			//System.out.println("Sorry!! You may not be lucky this time..");
			//System.out.println("Error: "+ref);
			//ref.printStackTrace();
		}catch(ArithmeticException aRef) {
			System.out.println("Something Went Wrong..."+aRef);
		}*/
		// Run Time Polymorphism
		catch(Exception eRef) {
			System.out.println("Some Error: "+eRef);
		}finally {
			System.out.println("Anyways, You can Try in Another ABC App");
		}
		
		System.out.println("You won a CashBack of \u20b9"+cashBack);
		System.out.println("You won an Additioanl CashBack of \u20b9"+additionalCashBack);

		

		System.out.println("Lucky Numbers App Finished...");
	}

}



/*
 	
 	Exception
 		ArithmeticException
 		ArrayIndexOutOfBoundsException
 		.
 		..
 		....
 		......
 		
 	RTP
 	
 */
