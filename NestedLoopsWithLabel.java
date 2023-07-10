
public class NestedLoopsWithLabel {

	public static void main(String[] args) {
		
		/*for(int i=1; i<=3; i++) {
			System.out.println("i is: "+i);
			System.out.println("hello");
			
			int a = 10;
			int b = 20;
			int c = a + b;
			
			System.out.println("c is: "+c);
		}*/
		
		outer:
		for(int i=1; i<=3; i++) {
			System.out.println("i is: "+i);
			
			kuchbhi:
			for(int j=1;j<=5;j++) {				
				if(j == 3) {
					//break;
					break outer;
				}
				System.out.println("j is: "+j);
			}
			
			System.out.println("-------");
			
		}
		
		

	}

}
