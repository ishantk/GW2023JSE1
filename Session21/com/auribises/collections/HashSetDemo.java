package com.auribises.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//ArrayList<String> names = new ArrayList<String>();
		//HashSet<String> names = new HashSet<String>();
		//LinkedHashSet<String> names = new LinkedHashSet<String>();
		TreeSet<String> names = new TreeSet<String>();
		
		// HashSet works on Hashing and not indexing
		names.add("John");
		names.add("Sia");
		names.add("John");
		names.add("Kim");
		names.add("Ben");
		names.add("Anna");
		
		
		//names.remove("Sia");
		//names.clear(); // remove all
		
		System.out.println("names size is: "+names.size());
		
		System.out.println(names.contains("Kim"));
		
		System.out.println("names is: "+names);
		
		//names.get(0); // error -> no indexing since HashSet works on hashing
		
		System.out.println("Enhanced For Loop");
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println();
		
		System.out.println("Iterator");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
