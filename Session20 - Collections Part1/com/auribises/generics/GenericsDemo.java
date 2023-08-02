package com.auribises.generics;

/*class Arithmetic{
	
	int number1;
	int number2;
	
	double number3;
	double number4;
	
	Arithmetic() {
	
	}
	
	Arithmetic(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	Arithmetic(double number3, double number4) {
		this.number3 = number3;
		this.number4 = number4;
	}



	int sum() {
		return number1 + number2;
	}
	
}*/

// Generics -> We can have a type, which can take any data type at run time
class Arithmetic<T, U>{
	
	T number1;
	T number2;
	U number3;

	
	Arithmetic() {
	
	}
	
	Arithmetic(T number1, T number2, U number3) {
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}


	//T sum() {
		//T result = T(number1 + number2);
		//return result;	
	//}
	
}

class PetOwner{
	
}

public class GenericsDemo {

	public static void main(String[] args) {
		
		// Generics in java does not support primitives
		//Arithmetic<int, int> aRef1 = new Arithmetic<int, int>();
		
		Arithmetic<Integer, Integer> aRef1 = new Arithmetic<Integer, Integer>();
		Arithmetic<Double, String> aRef2 = new Arithmetic<Double, String>();
		Arithmetic<PetOwner, Float> aRef3 = new Arithmetic<PetOwner, Float>();
		//System.out.println("sum1 is: "+aRef1.sum());

	}

}
