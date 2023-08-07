package com.auribises.java8features;

class Arithmetic{
	
	static void add(int num1, int num2) {
		System.out.println("Result is: "+(num1+num2));
	}
	
	void addNumbers(int n1, int n2) {
		System.out.println("Sum of "+n1+" and "+n2+" is: "+(n1+n2));
	}
	
}

@FunctionalInterface
interface Addition{
	void sum(int a, int b);
}

// Method Reference: Static/NonStatic/ Constructor(explore)

public class MethodReferencesDemo {

	public static void main(String[] args) {
		
		/*Addition aRef = (x, y) -> {
			System.out.println("Addition Result is: "+(x+y));
		};
		
		aRef.sum(10, 20);*/
		
		// Method Reference -> Let the lambda expression for Addition use the method definition of add
		//Addition aRef = Arithmetic::add;
		//aRef.sum(30, 40);
		
		Arithmetic ref = new Arithmetic();
		Addition aRef = ref::addNumbers;
		aRef.sum(30, 40);
		
	}

}
