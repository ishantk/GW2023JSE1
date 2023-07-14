
public class CiruclarDoublyLinkedList {

	public static void main(String[] args) {
		
		Song song1 = new Song("1. Udd Jaa Kaale Kaava", "Udit Narayan, Alka Yagnik", 4.48);
		Song song2 = new Song("2. Gustakhiyan", "Gurnam Bhullar", 3.39);
		Song song3 = new Song("3. Desperado", "Raghav, Tesher", 4.07);
		Song song4 = new Song("4. Chorni", "DIVINE, Sidhu Moose Wala", 3.01);
		Song song5 = new Song("5. Kasol", "Mani Longia, Starboy X", 2.40);
		
		System.out.println("song1: ");
		song1.show();
		
		System.out.println("song2: ");
		song2.show();
		
		System.out.println("song3: ");
		song3.show();
		
		System.out.println("song4: ");
		song4.show();
		
		System.out.println("song5: ");
		song5.show();
		
		
		// Manually, we are linking songs :)
		song1.next = song2;
		song2.next = song3;
		song3.next = song4;
		song4.next = song5;
		song5.next = song1;
		
		song1.previous = song5;
		song2.previous = song1;
		song3.previous = song2;
		song4.previous = song3;
		song5.previous = song4;
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("song1: ");
		song1.show();
		
		System.out.println("song2: ");
		song2.show();
		
		System.out.println("song3: ");
		song3.show();
		
		System.out.println("song4: ");
		song4.show();
		
		System.out.println("song5: ");
		song5.show();
		
		
		System.out.println("ITERATING IN FORWARD DIRECTION");
		Song temp = song1;
		
		while(true) {
			temp.show();
			temp = temp.next;
			
			if(temp == song1) {
				break;
			}
		}
		
		System.out.println("ITERATING IN BACKWARD DIRECTION");
		temp = song5;
		
		while(true) {
			temp.show();
			temp = temp.previous;
			
			if(temp == song5) {
				break;
			}
		}

	}

}
