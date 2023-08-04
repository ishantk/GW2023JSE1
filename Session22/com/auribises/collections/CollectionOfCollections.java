package com.auribises.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionOfCollections {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("john");
		//list1.add(10);
		
		// List of Lists
		ArrayList<ArrayList<String>> list2 = new ArrayList<ArrayList<String>>();
		list2.add(list1);
		
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		// List of Maps
		ArrayList<HashMap<String, String>> list3 = new ArrayList<HashMap<String,String>>();
		list3.add(map1);
		list3.add(map2);
		//list3.add(map3); error
		
		// Likewise as per the requirement, we can code any collection of collections :)

	}

}
