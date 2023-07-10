
public class TypeOfLoops {

	public static void main(String[] args) {
		
		int myFloor = 5;
		/*
		for(int floor=1;floor<=10;floor++) {
			System.out.println("Floor Arrived: "+floor);
			if(floor == myFloor) {
				break;
			}
		}*/
		
		/*int floor=1;
		while(floor <= 10) {
			System.out.println("Floor Arrived: "+floor);
			if(floor == myFloor) {
				break;
			}
			floor++;
		}*/
		
		
		// Infinite Loop
		/*while(true) {
			// code logic
			// a condition to break..
		}*/
		
		/*
		for(;;) {
			
		}*/
		

		int floor=1;
		do {
			System.out.println("Floor Arrived: "+floor);
			if(floor == myFloor) {
				break;
			}
			floor++;
		}while(floor <= 10);
		
		

	}

}
