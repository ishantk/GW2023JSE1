import java.util.Arrays;

public class ArraySytanxes {

	public static void main(String[] args) {
		
		// Syntax 1
		//int[] arr1 = {10, 20, 30, 40, 50};		// implicit statement
		int[] arr1 = new int[]{10, 20, 30, 40, 50}; // explicit statement
		
		// Syntax 2
		int arr2[] = {10, 20, 30, 40, 50};
		//int arr2[] = new int[]{10, 20, 30, 40, 50};
		
		System.out.println("arr1 is: "+arr1);
		System.out.println("arr2 is: "+arr2);
		
		System.out.println("Using For Loop:");
		for(int idx=0;idx<arr1.length;idx++) {
			//System.out.println(arr1[idx]);
			System.out.print(arr1[idx]+" ");
		}
		System.out.println();
		
		System.out.println("Enhanced For Loop:");
		for(int element : arr1) {
			System.out.print(element+" ");
		}
		
		System.out.println();
		System.out.println("Using Arrays.toString():");
		System.out.println(Arrays.toString(arr1));
		
		int a1[], a2;
		a1 = new int[] {1, 2, 3, 4, 5};
		a2 = 10;
		
		int[] a3, a4;
		a3 = new int[] {1, 2, 3};
		a4 = new int[] {1, 2, 3};
		
		// Create an Empty Array of 5 Integers
		int[] a5 = new int[5];
		
		// Update the data later :)
		a5[1] = 99;
		System.out.println("a5 is: ");
		System.out.println(Arrays.toString(a5));

	}

}
