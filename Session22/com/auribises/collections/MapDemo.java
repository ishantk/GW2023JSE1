package com.auribises.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashSet<String> userIds = new HashSet<String>();
		userIds.add("anna");
		userIds.add("john");
		userIds.add("sia");
		userIds.add("kim");
		userIds.add("ben");
		userIds.add("kim");
		userIds.add("john");
		
		System.out.println("userIds: "+userIds);
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "anna");
		map.put(102, "john");
		map.put(103, "sia");
		map.put(104, "kim");
		map.put(105, "ben");
		
		map.put(101, "leo");
		map.put(321, "yas");
		
		System.out.println("map is: "+map);
		
		String name = map.get(321);
		System.out.println("name is: "+name);
		
		for(int key : map.keySet()) {
			System.out.println(key+" | "+map.get(key));
		}
		
		//HashMap<String, String> users = new HashMap<String, String>();
		//LinkedHashMap<String, String> users = new LinkedHashMap<String, String>();
		TreeMap<String, String> users = new TreeMap<String, String>();
		users.put("john@example.com", "John Watson");
		users.put("ben@example.com", "Ben");
		users.put("anna@example.com", "Anna K");
		users.put("sia@example.com", "Sia");

		//users.put("ben@example.com", "Ben Jackson");
		
		users.put("ben.v@example.com", "Ben");
		
		System.out.println(users);
		
		Set<String> keys = users.keySet();
		System.out.println("keys: "+keys);
		
		/*
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			String value = users.get(key);
			
			System.out.println(key+"\t\t"+value);
		}
		*/
		
		//users.clear();
		
		for(String key : keys) {
			String value = users.get(key);
			System.out.println(key+"\t\t"+value);
		}
		
		if(users.containsKey("sia@example.com")) {
			System.out.println("key: sia@example.com exists");
		}
		
		if(users.containsValue("Anna K")) {
			System.out.println("value:Anna K exists");
		}
	}

}
