package com.auribises.java8features;

class Task implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Printing Copy#"+i);
		}
	}
	
}

public class ThreadsWithLambdaDemo {

	public static void main(String[] args) {
		
		//Runnable r = new Task();
		
		Runnable r = () -> {
			for(int i=1;i<=10;i++) {
				System.out.println("Printing Copy#"+i);
			}
		};
		
		//Thread th = new Thread(r);
		//th.start();
		// Create Thread using lambda expression
		new Thread(
				() -> {
					for(int i=1;i<=10;i++) {
						System.out.println("Printing Copy#"+i);
					}
				}
		).start();
		

	}

}
