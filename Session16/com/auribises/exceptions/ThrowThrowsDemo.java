package com.auribises.exceptions;

import java.io.IOException;

/*
 	
 	Exception Hierarchy
 	
 	Intro:
 	An exception is an error which occurs at run time
 	exception causes program to crash
 	
 	try, catch, finally
 	
 	
 	Types of Exceptions:
 	
 	Throwable
 		-Exception (They can be handled -> try, catch, finally)
 			
 			  UnChecked Exceptions
 			- RuntimeException
 				- ArrayIndexoutOfBoundsException
 				- NullPointerException
 				- ArithmeticException
 				.
 				...
 				.....
 			
 			Checked Exceptions
 			- IOException
 				- FileNotFoundException
 				.
 				...
 			- SQLException
 			.
 			..
 			...
 		-Error (These cannot be handled)
 			- OutOfMemoryError
 			- StackOverflowError
 			.
 			...
 			....
 	
 	
 */

// User Defined UnChecked Exception Class
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

//User Defined Checked Exception Class
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}

class BankAccount{
	
	int accountNumber;
	String name;
	int balance;
	int minBalance;
	int attempts;

	BankAccount(){
	
	}

	BankAccount(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
		balance = 10000;
		minBalance = 2000;
		System.out.println("New Account Created..");
		System.out.println(name+" | "+accountNumber+" | \u20b9"+balance);
	}
	
	
	void withdraw(int amount) throws IOException, YourBankingException {
		
		balance -= amount;
		
		if(balance <= minBalance) {
			balance += amount;
			System.out.println("[withdraw] [failed] Balance is Low: \u20b9"+balance);
			attempts++;
		}else {
			System.out.println("[withdraw] [success] New Balance is: \u20b9"+balance);
		}
		
		
		if(attempts == 3) {
			
			// Throwing an UnChecked Exception
			//ArithmeticException exception = new ArithmeticException("Illegal Attempts: "+attempts);
			// used to throw an exception -> to crash the program
			//throw exception;
			
			// Throwing a Checked Exception
			//IOException exception = new IOException("Illegal Attempts: "+attempts);
			//throw exception;
			
			// UnChecked Exception
			//MyBankingException exception = new MyBankingException("Illegal Attempts: "+attempts);
			//throw exception;
			
			// Checked Exception
			YourBankingException exception = new YourBankingException("Illegal Attempts: "+attempts);
			throw exception;
		
		}
	}
}


public class ThrowThrowsDemo {

	public static void main(String[] args) {
		
		System.out.println("Banking App Started...");
		
		BankAccount account = new BankAccount(101, "John");
		
		try {
			for(int i=1;i<=500;i++) {
				account.withdraw(3000);
			}
		}/*catch(IOException exception) {
			System.out.println("Something Went Wrong..."+exception);
		}catch(YourBankingException exception) {
			System.out.println("Something Went Wrong..."+exception);
		}*/
		catch(Exception e) {
			System.out.println("Something Went Wrong..."+e);
		}
		
		System.out.println("Banking App Finished...");
	}

}
