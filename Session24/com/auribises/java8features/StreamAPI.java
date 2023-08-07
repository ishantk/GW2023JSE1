package com.auribises.java8features;

import java.util.ArrayList;

public class StreamAPI {

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
		
		products
		.stream()
		.filter(product -> product.price > 85000 && product.price < 110000)
		.forEach(product -> System.out.println(product));
		
		/*int sum = 0;
		for(Product product : products) {
			sum += product.price;
		}
		System.out.println("sum is: "+sum);*/
		
		int totalPrice = products
							.stream()
							.map(product->product.price)
							.reduce(0, (sum, price) -> sum+price);
		
		System.out.println("Total is: "+totalPrice);
		

	}

}
