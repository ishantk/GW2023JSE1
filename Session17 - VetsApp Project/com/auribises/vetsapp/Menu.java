package com.auribises.vetsapp;

import java.util.Scanner;

import com.auribises.vetsapp.db.DBHelper;
import com.auribises.vetsapp.model.PetOwner;

public class Menu {
	
	DBHelper db = DBHelper.getDB();
	Scanner scanner = new Scanner(System.in);
	
	private void showPetOwnerMenu() {
		
		System.out.println("----------------------");
		System.out.println(">> Pet Owner Menu <<");
		System.out.println("----------------------");
		System.out.println("1: Add Pet Owner");
		System.out.println("2: Update Pet Owner");
		System.out.println("3: Delete Pet Owner");
		System.out.println("4: View All Pet Owners");
		System.out.println("5: View Pet Owner by Phone");
		System.out.println("0: Quit");
		System.out.println();
		
		System.out.println("Enter Your Choice: ");
		int choice = scanner.nextInt();
		
		while(true) {
			if(choice == 1) {
				
				PetOwner owner = new PetOwner();
				owner.readData();
				String sql = owner.getInsertSql();
				
				db.execute(sql);
			}else if(choice == 2) {
				
			}else if(choice == 3) {
				
			}else if(choice == 4) {
				
			}else if(choice == 5) {
				
			}else if(choice == 0) {
				break;
			}else {
				System.out.println("Invalid Choice..");
			}
			
			System.out.println("Enter Your Choice: ");
			choice = scanner.nextInt();
		}
		
	}
	
	private void showPetMenu() {
	
		while(true) {
			
			System.out.println("---------------");
			System.out.println(">> Pet Menu <<");
			System.out.println("-----------------");
			System.out.println("1: Add Pet");
			System.out.println("2: Update Pet");
			System.out.println("3: Delete Pet");
			System.out.println("4: View All Pets");
			System.out.println("5: View Pet Of an Owner");
			System.out.println("0: Quit");
			System.out.println();
			
			System.out.println("Enter Your Choice: ");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				
			}else if(choice == 2) {
				
			}else if(choice == 3) {
				
			}else if(choice == 4) {
				
			}else if(choice == 5) {
				
			}else if(choice == 0) {
				break;
			}else {
				System.out.println("Invalid Choice..");
			}
			
		}
	
	}
	
	private void showConsultationMenu() {
		
		
		while(true) {
			System.out.println("------------------------");
			System.out.println(">> Consultation Menu <<");
			System.out.println("------------------------");
			System.out.println("1: Add Consultation");
			System.out.println("2: Update Consultation");
			System.out.println("3: Delete Consultation");
			System.out.println("4: View All Consultation");
			System.out.println("5: View Consultation Of a Pet");
			System.out.println("0: Quit");
			System.out.println();
			
			System.out.println("Enter Your Choice: ");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				
			}else if(choice == 2) {
				
			}else if(choice == 3) {
				
			}else if(choice == 4) {
				
			}else if(choice == 5) {
				
			}else if(choice == 0) {
				break;
			}else {
				System.out.println("Invalid Choice..");
			}
		}		
	}
	
	public void showMainMenu() {
		
		while(true) {
			
			System.out.println("----------------");
			System.out.println(">> Main Menu <<");
			System.out.println("----------------");
			System.out.println("1: Manage Pet Owners");
			System.out.println("2: Manage Pets");
			System.out.println("3: Manage Consultations");
			System.out.println("0: Quit");
			System.out.println();
			
			System.out.println("Enter Your Choice: ");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				showPetOwnerMenu();
			}else if(choice == 2) {
				showPetMenu();
			}else if(choice == 3) {
				showConsultationMenu();
			}else if(choice == 0) {
				scanner.close();
				break;
			}else {
				System.out.println("Invalid Choice..");
			}
			
		}
	}

}
