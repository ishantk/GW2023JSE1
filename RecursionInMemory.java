import java.util.Arrays;

public class RecursionInMemory {

	
	public static int getMax(int[] numbers, int length) {
		
		// BASE CONDITION :)
		if(length == 1) {
			return numbers[0];
		}else {
			int result = getMax(numbers, length-1);
			if(result > numbers[length-1]) {
				return result;
			}else {
				return numbers[length-1];
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] data = {20, 30, 10};
		System.out.println("[main] data is: "+data);
		System.out.println("[main] data content: "+Arrays.toString(data));
		
		int max = getMax(data, data.length);
		System.out.println("[main] MAX is: "+max);

	}

}

// Factorial of a Number
// 3 -> 3 * 2 * 1 => 6




