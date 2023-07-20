
public class MutableStrings {

	public static void main(String[] args) {
		
		String names = "John, Jennie, Jim, Jack, Joe";
		String s1 = names.replace('J', 'K');
		//names.replace("Jo", "Ko");
		
		String s2 = names.concat(", Sia");
		
		System.out.println("Names: " + names);
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);

		String str = new String("Hello");
		//str.concat(" World");
		String s3 = str + " World";
		System.out.println("str is: "+str);
		System.out.println("s3 is: "+s3);
		
		// Mutable String
		//StringBuffer buffer1 = "Hello"; -> error
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		System.out.println("buffer is: "+buffer);
		
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		System.out.println("builder is: "+builder);
		
		// StringBuffer -> THREAD-SAFE
		// StringBuilder -> NOT THREAD-SAFE
	}

}
