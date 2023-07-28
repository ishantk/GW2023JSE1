package com.auribises.vetsapp;

/*
 
 VetsApp
	
	A Vet Doctor would like to manage customers/pet owners
	A Vet Doctor would like to manage pets of pet owner
	A Vet Doctor would like to manage consultations of the pet


 */

public class App {
	
	static void printMessage(String text) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(text);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	

	public static void main(String[] args) {
		
		printMessage("Welcome to Vets App");

		new Menu().showMainMenu();
		
		printMessage("Thank You for Using Vets App");

	}

}
