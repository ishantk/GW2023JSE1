package com.auribises.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class Patient{
	
	int pid;
	String name;
	String gender;
	int age;
	
	
	Patient(){
		
	}


	Patient(int pid, String name, String gender, int age) {
		this.pid = pid;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	@Override
	public String toString() {
		String patient = pid+","+name+","+gender+","+age+"\n";
		return patient;
	}
}

public class FileDemo {

	public static void main(String[] args) {
		
		/*Patient p1 = new Patient(1, "John", "Male", 23);
		Patient p2 = new Patient(2, "Fionna", "Female", 31);
		
		System.out.println(p1);
		System.out.println(p2);*/

		// Write Data in File
		/*try {
			
			File file = new File("/Users/ishant/Downloads", "patients-aug-7-2023.csv");
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file, true); // enable append mode
			//writer.write(p1.toString());
			writer.write(p2.toString());
			writer.close();
			System.out.println("Data Written in File..");
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}*/
		
		// Read from File
		try {
			
			File file = new File("/Users/ishant/Downloads", "patients-aug-7-2023.csv");
			
			FileReader reader = new FileReader(file); // reads char by char
			BufferedReader buffer = new BufferedReader(reader); // reads line by line
			
			String line = buffer.readLine();
			/*System.out.println("Line:"+line);
			
			line = buffer.readLine();
			System.out.println("Line:"+line);*/
			
			System.out.println(line);
			while((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
			buffer.close();
			reader.close();
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
	}

}
