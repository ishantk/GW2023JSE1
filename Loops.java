import java.util.Scanner;

// You will get a class
public class Loops {

	// within the class, we do have a main method
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// LINEAR SEARCH :)
		
						//  0         1
		String[] names = {"john", "jennie", "harry", "fionna", "sia", "kim", "george"};
		String[] phones = {"99999 11111", "99999 12222", "87999 11111", "99899 12221", "77999 14411", "98899 11155", "66999 11111"};
				
		// Search
		System.out.println("Enter the Name: ");
		String name = scanner.nextLine();
		scanner.close();
		
		int searchIdx = -1;
		
		for(int idx=0; idx<names.length;idx++) {
			System.out.println("IDX: "+idx+" Matching "+name+" with "+names[idx]);
			
			//if(name.compareTo(names[idx]) == 0) {
			if(name.equals(names[idx])) {
				searchIdx = idx;
				break;
			}
			
		}
		
		if(searchIdx != -1) {
			System.out.println("NAME FOUND AT IDX: "+searchIdx);
			System.out.println(names[searchIdx]+" has Phone Number: "+phones[searchIdx]);
		}else {
			System.out.println("NAME NOT FOUND");
		}

	}

}
