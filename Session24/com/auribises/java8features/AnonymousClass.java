package com.auribises.java8features;

interface Payment{
	void pay(int amount); // public abstract void pay();
	void error();
	void success();
}

/*class MyPaymentGatewtay implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("Pay: "+amount);
	}

	@Override
	public void error() {
		System.out.println("Error");
	}

	@Override
	public void success() {
		System.out.println("Success");
	}
	
}*/


public class AnonymousClass {

	public static void main(String[] args) {
		
		/*Payment pRef = new MyPaymentGatewtay();
		pRef.pay(100);
		pRef.success();
		pRef.error();*/
		
		
		// Anonymous Class :)
		Payment pRef = new Payment() {
			
			@Override
			public void pay(int amount) {
				System.out.println("Pay: "+amount);
			}

			@Override
			public void error() {
				System.out.println("Error");
			}

			@Override
			public void success() {
				System.out.println("Success");
			}
		};
		
		pRef.pay(100);
		pRef.success();
		pRef.error();

	}

}
