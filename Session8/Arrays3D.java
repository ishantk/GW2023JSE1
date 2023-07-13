
public class Arrays3D {

	public static void main(String[] args) {
		
		int[][] populationIndia = {
				{1200, 3500, 800, 1900, 4500},
				{11200, 3100, 1800, 900, 1500},
				{1200, 13100, 800, 9100, 500}
		};
		
		int[][] populationChina = {
				{1200, 3500, 800, 1900, 4500},
				{11200, 3100, 1800, 900, 1500},
				{1200, 13100, 800, 9100, 500},
				{11200, 3100, 1800, 900, 1500},
				{1200, 13100, 800, 9100, 500}
		};
		
		int[][] populationUSA = {
				{1200, 3500, 800, 1900, 4500},
				{11200, 3100, 1800, 900, 1500}
		};

		int[][][] worldPopulation = {
				{
					{1200, 3500, 800, 1900, 4500},
					{11200, 3100, 1800, 900, 1500},
					{1200, 13100, 800, 9100, 500}
			    },	
				{
					{1200, 3500, 800, 1900, 4500},
					{11200, 3100, 1800, 900, 1500},
					{1200, 13100, 800, 9100, 500},
					{11200, 3100, 1800, 900, 1500},
					{1200, 13100, 800, 9100, 500}
			    },
				{
					{1200, 3500, 800, 1900, 4500},
					{11200, 3100, 1800, 900, 1500}
			    }
		};
		
		System.out.println("worldPopulation is: "+worldPopulation);				  // HashCode
		System.out.println("worldPopulation length is: "+worldPopulation.length); // 3
		
		System.out.println("worldPopulation[1] is: "+worldPopulation[1]);		 // HashCode
		System.out.println("worldPopulation[1] length is: "+worldPopulation[1].length); // 5
		
		System.out.println("worldPopulation[1][1] is: "+worldPopulation[1][1]); // HashCode
		System.out.println("worldPopulation[1][1] length is: "+worldPopulation[1][1].length); // 5
		
		System.out.println(worldPopulation[1][1][1]); // 3100
		
	}
	
	// Assignment: Print 2D Array and 3D Array using for loops and Enhanced for loops

}
