
public class WhyMethods {

	public static void main(String[] args) {
		
		
		int[] prices = {100, 1200, 300, 4500, 120, 700}; // 4500
		int[] teamPoints = {2, 4, 8, 6, 10, 1};
		int[] salaries = {2000, 40000, 180000, 60000, 11000, 21000};
		
		
		int max = prices[0]; // 100
		
		// Loop to find max in prices array
		for(int idx=1; idx<prices.length; idx++) {
			if(prices[idx] > max) {
				max = prices[idx];
			}
		}
		
		System.out.println("1. Max is: "+max);
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		max = teamPoints[0];
		for(int idx=1; idx<teamPoints.length; idx++) {
			if(teamPoints[idx] > max) {
				max = teamPoints[idx];
			}
		}
		
		System.out.println("2. Max is: "+max);
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		max = salaries[0];
		for(int idx=1; idx<salaries.length; idx++) {
			if(salaries[idx] > max) {
				max = salaries[idx];
			}
		}
		
		System.out.println("3. Max is: "+max);
		
	}

}
