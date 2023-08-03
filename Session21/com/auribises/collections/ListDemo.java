package com.auribises.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/*
 
 	Built In Data Structures :)
 	available inside the package - java.util
 	
 	List - ArrayList, LinkedList, Vector, Stack
 	Queue - PriorityQueue
 	Set - HashSet, LinkedHashSet, TreeSet
 	
 	
 	Reference:
 	interface List{
 	
 	}
 	
 	class ArrayList implements List{
 	
 	}
 	
 	class LinkedList implements List{
 	
 	}
 	
 */

public class ListDemo {

	public static void main(String[] args) {

		// Array has fixed Size :)
		int[] data = {10, 20, 30, 40, 50};
		System.out.println("data is: "+data);
		//data[5] = 60;
		
		// Hetro
		//ArrayList list = new ArrayList();
		
		
		//LinkedList list = new LinkedList();
		//Vector list = new Vector();
		//Stack list = new Stack();
		
		// Homo
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("list is:"+ list);
		
		//list.add(0, 10); // 0
		list.add(10); // 0
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50); // 4
		
		System.out.println("list is:"+ list);
		list.add(60); // 5
		list.add(70); // 6
		//list.add(7, 80); // 7
		list.add(80); // 7
		
		list.remove(3);
		list.set(0, 101);
		list.set(5, 545);
		
//		list.add("John"); // error
//		list.add("Kim");
//		
//		list.add(20.33);
		
		
		System.out.println("list now is:"+ list);
		
		System.out.println("Data at index 5 is: "+list.get(5));
		
		System.out.println("List Size is: "+list.size());
	}

}
