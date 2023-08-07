package com.auribises.java8features;

// An interface with one method -> Functional Interface
// @FunctionalInterface is an annotation -> act as rules

@FunctionalInterface
interface Compare{
	void compareTo();
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		// Anonymous class
		/*Compare cRef = new Compare() {
			@Override
			public void compareTo() {
				System.out.println("This is compare to method");
			}
		};*/

		// Let us change the Syntax
		// Lambda Expression :)
		Compare cRef = () -> {
			System.out.println("This is compare to method");
		};
		
		
		cRef.compareTo();
		
	}

}
