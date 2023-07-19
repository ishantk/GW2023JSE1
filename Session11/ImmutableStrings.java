
public class ImmutableStrings {

	public static void main(String[] args) {
		
		// STRINGS ARE IMMUTABLE (which cannot be changed)
		String names = "John, Jennie, Jim, Jack, JOE";
		
		String upperCaseNames = names.toUpperCase();
		String lowerCaseNames = names.toLowerCase();
		
		System.out.println("names: "+names);
		System.out.println("upperCaseNames: "+upperCaseNames);
		System.out.println("lowerCaseNames: "+lowerCaseNames);
		
		int length = names.length();
		System.out.println("Length is: "+length);
		
		char ch = names.charAt(1); // o
		ch = names.charAt(length-1); // ?
		System.out.println("ch is: "+ch);

		char[] data = names.toCharArray();
		System.out.println(data); // String :)
		System.out.println("data is: "+data); // HashCode
		System.out.println("data is: "+data.toString()); // HashCode 
		
		for(char c : data) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		// Create String from array of characters
		String namesAgain = new String(data);
		System.out.println("namesAgain: "+namesAgain);
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".")) {
			System.out.println("Valid Email");
		}else {
			System.out.println("Invalid Email");
		}
		
		//String[] splitNames =  names.split(",");
		String[] splitNames =  names.split(", ");
		//String[] splitNames =  names.split("J");
		for(String str : splitNames) {
			//System.out.println(str.strip());
			System.out.println(str);
		}
		
		int idx = names.indexOf('J');
		idx = names.lastIndexOf('J');
		idx = names.indexOf("Jennie");
		System.out.println("idx is: "+idx);
		
		String song = "some-abc-song.mp3";
		if(song.endsWith(".mp3")) { // startsWith
			System.out.println("You can Play the Song..");
		}else {
			System.out.println("Not an audio file...");
		}
		
	}

}
