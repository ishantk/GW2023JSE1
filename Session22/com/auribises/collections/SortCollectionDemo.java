package com.auribises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Product implements Comparable<Product>{
	
	String name;
	String brand;
	int price;
	
	Product() {
	
	}

	Product(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		return name.compareTo(o.name);
	}

}

class SortProductByName implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class SortProductByPriceLowToHigh implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price > o2.price) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

class SortProductByPriceHighToLow implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price < o2.price) {
			return 1;
		}else {
			return -1;
		}
	}
}


public class SortCollectionDemo {

	public static void main(String[] args) {
		
		Product p1 = new Product("iPhone 14 Pro Max", "Apple", 150000);
		Product p2 = new Product("Galaxy Fold", "Samsung", 90000);
		Product p3 = new Product("MacBook Pro", "Apple", 250000);
		Product p4 = new Product("Alphabounce", "Adidas", 7000);
		Product p5 = new Product("Fridge", "Hitachi", 65000);
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(new Product("Alphabounce", "Adidas", 7000));
		products.add(new Product("Fridge", "Hitachi", 65000));
		
		
		SortProductByName sortByName = new SortProductByName();
		SortProductByPriceLowToHigh sortLowToHigh = new SortProductByPriceLowToHigh();
		SortProductByPriceHighToLow sortHighToLow = new SortProductByPriceHighToLow();
		
		
		// Sort the ArrayList
		//Collections.sort(products);
		
		//Collections.sort(products, sortByName);
		//Collections.sort(products, sortLowToHigh);
		Collections.sort(products, sortHighToLow);
		
		System.out.println("eCommerce Shop...");
		System.out.println("-----------------");
		for(Product product : products) {
			System.out.println("````````````````````````````````````````````````````````````");
			System.out.println(product);
			System.out.println("````````````````````````````````````````````````````````````");
			System.out.println();
		}
		
		
		System.out.println("=======================");
		
		TreeSet<Product> set = new TreeSet<Product>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
		for(Product product : products) {
			System.out.println("````````````````````````````````````````````````````````````");
			System.out.println(product);
			System.out.println("````````````````````````````````````````````````````````````");
			System.out.println();
		}

	}

}
