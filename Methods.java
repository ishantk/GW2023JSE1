
/*
 	
 	f(x) = y
 	where y = x*x + 1
 	
 	x->1
 	f(1) = 1*1 + 1 -> 2
 	f(2) = 2*2 + 1 -> 5
 	
 */

public class Methods {
	
	
	/*static void f(int x) {
		
		int y = x*x + 1;
		System.out.println("y is: "+y);

	}*/
	
	//public static int f(int x) {
	static int f(int x) {
		
		//int y = x*x + 1;
		//System.out.println("y is: "+y);
		//return y;
		
		return (x*x + 1);

	}

	

	public static void main(String[] args) {
		
		int result = f(1);
		System.out.println("Result is: "+result);
		
		System.out.println("Result is: "+f(2));
		System.out.println("Result is: "+f(3));

	}

}
