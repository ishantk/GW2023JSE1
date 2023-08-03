package com.auribises.wrapper;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		// Primitive :)
		int i = 10;
		
		// In Java, when we use OOPS
		// everything is reference type
		// i.e. ref var holds the hashcode of the object, which resides in heap
		
		// Integer Object
		//Integer iRef = new Integer(10);
		Integer iRef = Integer.valueOf(10);

		// In java, every primitive type has an object version
		// object version is known as WRAPPER CLASS
		
		/*
		 	int -> Integer
		 	char -> Character
		 	float -> Float
		 	long -> Long
		 	double -> Double
		 	short -> Short
		 	.
		 	...
		 */
		
		// Primitive Type
		char ch = 'A';
		
		// Reference Type | BOXING :)
		Character chRef = Character.valueOf(ch);
		
		// Primitive Type
		double pi = 3.14;
		// Reference Type | BOXING :)
		//Double dRef = Double.valueOf(pi);
		
		// AUTO - BOXING
		Double dRef = pi;
		
		// Get Primtive from Reference Type
		// UNBOXING
		char chr = chRef.charValue();
		
		// UNBOXING
		//double d = dRef.doubleValue();
		
		// AUTO - UNBOXING 
		double d = dRef;
		
	}

}
