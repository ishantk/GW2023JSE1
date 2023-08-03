package com.auribises.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Pet{
	
	String name;
	String breed;
	
	Pet(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", breed=" + breed + "]";
	}
	
}

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jennie");
		names.add("Jim");
		names.add("Jack");
		names.add("Joe");
		
		ArrayList<Pet> pets = new ArrayList<Pet>();
		
		Pet pet1 = new Pet("Elsa", "Husky");
		Pet pet2 = new Pet("Zoey", "Labra");
		Pet pet3 = new Pet("Boozo", "Labra");
		
		pets.add(pet1);
		pets.add(pet2);
		pets.add(pet3);
		//pets.add(10); // error
		
		
		int element = list.get(1);
		System.out.println("element is: "+element);
		
		System.out.println("---Using Basic For Loop---");
		for(int idx=0;idx<list.size();idx++) {
			int elem = list.get(idx);
			System.out.println(elem);
		}
		
		System.out.println();
		
		System.out.println("---Using Enhanced For Loop---");
		for(int elem : list) {
			System.out.println(elem);
		}
		
		System.out.println();
		
		System.out.println("---Using Enhanced For Loop---");
		for(String elem : names) {
			System.out.println(elem);
		}
		
		System.out.println();
		
		System.out.println("---Using Enhanced For Loop---");
		for(Pet elem : pets) {
			System.out.println(elem);
		}
		
		System.out.println();
		
		// Fetch Data one by one
		System.out.println("---Using Iterator---");
		
		Iterator<Integer> itr1 = list.iterator();
		Iterator<String> itr2 = names.iterator();
		Iterator<Pet> itr3 = pets.iterator();
		
		/*
		System.out.println(itr1.next());
		System.out.println(itr1.next());
		System.out.println(itr2.next());
		System.out.println(itr3.next());
		System.out.println(itr3.next());*/
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("---Using List Iterator---");
		ListIterator<Pet> listItr = pets.listIterator();
		System.out.println(listItr.next());
		System.out.println(listItr.next());
		System.out.println(listItr.next());
		
		System.out.println("Iterat Backward");
		System.out.println(listItr.previous());
		System.out.println(listItr.previous());
		System.out.println(listItr.previous());
		
		
		System.out.println("Iterate Forward");
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		System.out.println("Iterate Forward");
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		int number = 202;
		if(list.contains(number)) {
			System.out.println(number+" is in the list");
		}else {
			System.out.println(number+" is not in the list");
		}
		
		if(pets.contains(pet2)) {
			System.out.println(pet2.name+" is in the list");
		}
		
		int idx = pets.indexOf(pet2);
		System.out.println("idx is: "+idx);
	}

}
