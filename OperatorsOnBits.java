
public class OperatorsOnBits {

	public static void main(String[] args) {
		// Bitwise Operators
		// &, |, ^
		int num1 = 10; 				// 1 0 1 0
		int num2 = 8;  				// 1 0 0 0
		
		int result1 = num1 & num2;	// 1 0 0 0 -> 8
		int result2 = num1 | num2;	// 1 0 1 0 -> 10
		int result3 = num1 ^ num2;  // 0 0 1 0 -> 2
		
		// Shift Operators
		int result4 = 8 >> 3;
		int result5 = 8 << 3;
		System.out.println("Result4 is: "+result4); // 1
		System.out.println("Result5 is: "+result5); // 64
		
		int result6 = 11 >> 2;
		System.out.println("Result6 is: "+result6);
		
		/*
		 	11 -> 1 0 1 1
		 		  _ _ 1 0
		 		  0 0 1 0 -> 2
		 	
		 */
		
		int result7 = -11 >> 2;
		System.out.println("Result7 is: "+result7);
		
		/*
	 		11 -> 1 0 1 1
				  0 1 0 0  1s complement
				  		1  2s complement
				  0 1 0 1 -> -11
				  
				  _ _ 0 1
				  1 1 0 1
				  
				  0 0 1 0
				        1
				  0 0 1 1 -> -3
	 	
		 */
		
		int result8 = -13 >> 3;
		System.out.println("Result8 is: "+result8);
		/*
		 	13 -> 1 1 0 1
		 		  0 0 1 0
		 		  		1
		 		  0 0 1 1
		 		  >> 3
		 		  _ _ _ 0
		 		  1 1 1 0
		 		  0 0 0 1
		 		        1
		 		  0 0 1 0 -> -2
		 */
		
		int data = 12;
		int secretCode = 2;
		
		int dataToSend = data >> secretCode;
		System.out.println("dataToSend is: "+dataToSend);
		
		int dataToReceive = dataToSend << secretCode;
		System.out.println("dataToReceive is: "+dataToReceive);
		
		

	}

}
