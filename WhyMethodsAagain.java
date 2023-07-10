
public class WhyMethodsAagain {

	public static int getMax(int[] array) {
		
		int max = array[0]; 
		
		// Loop to find max in array
		for(int idx=1; idx<array.length; idx++) {
			if(array[idx] > max) {
				max = array[idx];
			}
		}

		return max;
	}
	
	public static void main(String[] args) {
		
		int[] prices = {100, 1200, 300, 4500, 120, 700}; // 4500
		int[] teamPoints = {2, 4, 8, 6, 10, 1};
		int[] salaries = {2000, 40000, 180000, 60000, 11000, 21000};
		
		System.out.println("Max in prices: "+getMax(prices));
		System.out.println("Max in teamPoints: "+getMax(teamPoints));
		System.out.println("Max in salaries: "+getMax(salaries));

		if(getMax(salaries) > 150000) {
			System.out.println("JOIN THE COMPANY....");
		}
		
	}

}
