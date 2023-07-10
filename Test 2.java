import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		/*
		 
		 	Another Brick in the Wall...
		 	
		 	wall
		 	totalBricksToBePlaced: 13
		 	
		 	john: 1 2 3 4 5...
		 	jack: 2 4 6 8 10
		 	
		 	totalBrciks: 1 + 2 + 2 + 4 + 3 + 6
		 								 12
		 
		 	Who placed the last brick and how many ?
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many bricks you want to place for the wall: ");
		int totalBricksToBePlaced = scanner.nextInt();
		
		int totalBricksPlaced = 0;
		
		for(int idx=1;idx<=totalBricksToBePlaced;idx++) {
			
			totalBricksPlaced += idx;
			System.out.println("Bricks Placed by John: "+idx+" Total Bricks "+totalBricksPlaced);
			
			if(totalBricksPlaced >= totalBricksToBePlaced) {
				int difference = totalBricksPlaced - totalBricksToBePlaced;
				System.out.println("John Placed Last Brick: "+ (idx-difference));
				break;
			}
			
			totalBricksPlaced += idx*2;
			System.out.println("Bricks Placed by Jack: "+ (idx*2)+" Total Bricks "+totalBricksPlaced);
			
			if(totalBricksPlaced >= totalBricksToBePlaced) {
				int difference = totalBricksPlaced - totalBricksToBePlaced;
				System.out.println("Jack Placed Last Brick: "+ ((idx*2)-difference));
				break;
			}
			
		}

	}

}

// Assignment : Rectify the Output :)
