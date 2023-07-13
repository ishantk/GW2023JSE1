import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		int[] populationPunjab = {1200, 3500, 800, 1900, 4500};
		int[] populationHaryana = {11200, 3100, 1800, 900, 1500};
		int[] populationGujrat = {1200, 13100, 800, 9100, 500};
		
		System.out.println("populationPunjab is: "+populationPunjab); 		// HashCode
		System.out.println("populationPunjab[1] is: "+populationPunjab[1]); // 3500
		System.out.println("populationPunjab length is: "+populationPunjab.length); // 5
		
		int[][] populationIndia = {
				{1200, 3500, 800, 1900, 4500},
				{11200, 3100, 1800, 900, 1500},
				{1200, 13100, 800, 9100, 500}
		};
		
		System.out.println("populationIndia is: "+populationIndia); // HashCode
		System.out.println("populationIndia[0] is: "+populationIndia[0]); // HashCode
		System.out.println("populationIndia[0][2] is: "+populationIndia[0][2]);//  800
		System.out.println("populationIndia length is: "+populationIndia.length); // 3
		System.out.println("populationIndia[1] length is: "+populationIndia[1].length); // 5
		
		// Create 5 1-D Arrays with each Array having 3 elements each
		// And all the elements will be by default 0
		//int[][] array = new int[5][3];
		
		// Jagged Arrays :)
		int[][] array = new int[5][];
		array[0] = new int[3];
		array[1] = new int[5];
		array[2] = new int[10];
		array[3] = new int[4];
		array[4] = new int[2];
		
		System.out.println(Arrays.toString(array));
		
		array[2][1] = 99;
		//array[4][4] = 101; -> Run Time Error :)
		
		for(int idx=0;idx<array.length;idx++) {
			System.out.println(Arrays.toString(array[idx]));
		}
		

	}

}
