package com.auribises.threads;

/*class PrintingTask{
	
	void printPaper(String name, int copies) {
		for(int i=1; i<=copies; i++) {
			System.out.println("[PrintingTask] Prinitng Paper "+name+" Copy#"+i);
		}
	}
}*/

// PrintingTask IS-A Thread
class PrintingTask extends Thread{
	
	String name;
	int copies;
	
	PrintingTask(){
		
	}
	
	PrintingTask(String name, int copies) {
		this.name = name;
		this.copies = copies;
	}

	// you need to override the run method
	public void run(){
		for(int i=1; i<=copies; i++) {
			System.out.println("[PrintingTask] Prinitng Paper "+name+" Copy#"+i);
		}
	}
}

class CA{
	
}

//class PackagingTask extends CA, Thread{ // error

class PackagingTask extends CA implements Runnable{	
	String name;
	int copies;
	
	PackagingTask(){
		
	}
	
	PackagingTask(String name, int copies) {
		this.name = name;
		this.copies = copies;
	}

	// you need to override the run method
	public void run(){
		for(int i=1; i<=copies; i++) {
			System.out.println("[PackagingTask] Packaging "+name+" Copy#"+i);
		}
	}
}

public class App {

	public static void main(String[] args) {
		
		System.out.println("[main] App Started....");
		
		PrintingTask task1 = new PrintingTask("JavaWithIshant.pdf", 10);
		
		PackagingTask task2 = new PackagingTask("T-Shirt", 20);
		Thread thread = new Thread(task2);
		
		
		task1.start(); // start will internally execute the run method
		// task2.start(); error
		thread.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("[main] Prinitng Java Assignment Page#"+i);
		}
		
		//PrintingTask task = new PrintingTask();
		//task.printPaper("JavaWithIshant.pdf", 10000);
		
		
		System.out.println("[main] Notify Printing Finished....");
		
		System.out.println("[main] App Finished....");

	}

}
