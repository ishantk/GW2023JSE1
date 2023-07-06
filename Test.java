import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50};
		
		int[] b = {11, 22, 33, 44, 55};
		
		int[] c = a;
		
		int[] d = c;
		
		b = a;
		c = b;
		
		c[1] = 99;
		
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		

	}

}
