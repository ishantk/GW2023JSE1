package com.auribises.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
	@author: Ishant
*/
class Product{
	String name;
	int price;
	
	public Product() {
	
	}

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}


class SortByName implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {	
		return o1.name.compareToIgnoreCase(o2.name);
	}

}

public class CompareLambdaDemo {

	public static void main(String[] args) {

		Product p1 = new Product("iPhone 14pro max", 130000);
		Product p2 = new Product("Macbook Air", 90000);
		Product p3 = new Product("Samsung Fold", 80000);
		Product p4 = new Product("Hitachi Fridge", 120000);
		Product p5 = new Product("Adidas Ultraboost", 10000);
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		
		/*Comparator<Product> sortingTechnique = new Comparator<Product>(){

			@Override
			public int compare(Product o1, Product o2) {	
				return o1.name.compareToIgnoreCase(o2.name);
			}

		};*/
		
		//SortByName sortingTechnique = new SortByName();
		
		Comparator<Product> sortingTechnique = (Product o1, Product o2) -> {
			//return o1.name.compareToIgnoreCase(o2.name);
			return Integer.compare(o1.price, o2.price);
		};
		
		//Collections.sort(products, sortingTechnique);
		
		//products.forEach(
		//		(product)->System.out.println(product)
		//);
		
		Collections.sort(products, (Product o1, Product o2) -> {
			return o1.name.compareToIgnoreCase(o2.name);
			//return Integer.compare(o1.price, o2.price);
		});
		
		products.forEach(
			(product)->System.out.println(product)
		);
		
	}

}
