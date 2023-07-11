import java.util.Arrays;

public class ValueVsReference {

	public static void squareOfNums(int[] nums) {
		System.out.println("[squareOfNums] nums is: "+nums);
		System.out.println("[squareOfNums] Data in nums is: "+Arrays.toString(nums));
		
		for(int idx=0;idx<nums.length;idx++) {
			nums[idx] = nums[idx] * nums[idx];
		}
		
		System.out.println("[squareOfNums] nums now is: "+nums); 
		System.out.println("[squareOfNums] Data in nums now is: "+Arrays.toString(nums));
		
	}
	
	public static void square(int num) {
		System.out.println("[square] num is: "+num); // 10
		// Update Operation :)
		num = num * num;
		System.out.println("[square] num now is: "+num); // 100
	}
	
	
	// Whatever we write in main, is executed by main thread :)
	public static void main(String[] args) {
		int number = 10;
		
		int[] numbers = {10, 20, 30, 40, 50}; 
		System.out.println("[main] numbers is: "+numbers);
		System.out.println("[main] Data in Numbers is: "+Arrays.toString(numbers));
		
		squareOfNums(numbers);
		
		System.out.println("[main] numbers now is: "+numbers);
		System.out.println("[main] Data in Numbers now is: "+Arrays.toString(numbers));

		
		//System.out.println("[main] number is: "+number); // 10
		//square(number);
		//System.out.println("[main] number now is: "+number); // 10

	}

}
