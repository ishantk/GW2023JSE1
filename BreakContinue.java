
public class BreakContinue {

	public static void main(String[] args) {
		
		
		for(int idx=1;idx<=10;idx++) {
			
			/*if(idx == 5) {
				break;
			}*/
			
			if(idx <= 5) {
				continue;
			}
			
			System.out.println("idx is: "+idx);
			
		}
		
		

	}

}
