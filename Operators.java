
public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic Operators +, -, *, /, %
		
		double amount = 125.25;
		double taxes = 0.18;
		int deliveryFee = 25;
		
		double amountToPay = amount + (amount*taxes) + deliveryFee;
		
		System.out.println("amountToPay is: \u20b9"+amountToPay);
		
		int num1 = 13;
		int result = num1 / 3;
		System.out.println("Result is: "+result);
		
		// Assignment Operators
		// =, +=, -=, *=, /=, %=
		
		int age = 20;
		//age = age + 3;
		age += 3;
		age += 10;
		age -= 5;
		age %= 3;
		System.out.println("age is: "+age);
		

		// Increment and Decrement Operators
		// ++ --
		// +=1 | -=1
		int quantity = 1;
		quantity++; // 2
		++quantity; // 3
		--quantity; // 2
		++quantity; // 3
		quantity--; // 2
		
		System.out.println("quantity is: "+quantity); // 2
		
		//int finalQuantity = quantity++;
		int finalQuantity = ++quantity;
		
		System.out.println("finalQuantity is: "+finalQuantity); // 3
		System.out.println("quantity is: "+quantity); // 3
		
		int x = 10;
		int y = x + ++x + x++;
		
		System.out.println("y is: "+y);
		System.out.println("x is: "+x);
		
		
	}

}
