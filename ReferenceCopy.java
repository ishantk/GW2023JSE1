import java.util.Arrays;

public class ReferenceCopy {

	public static void main(String[] args) {
		
		int[] scores = {12, 30, 45, 66, 70, 90, 100, 12, 15, 68};
		int[] rollNumbers = {1, 2, 3, 4, 5};
		
		System.out.println("scores is: "+scores);
		
		// REFERENCE COPY OPERATION
		int[] teamScores = scores;
		
		System.out.println("teamScores is: "+teamScores);
		
		// Update Operation
		teamScores[0] = 99;
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(teamScores));

		int age = 20;
		int johnsAge = age;
		johnsAge = 30;
		
		System.out.println("Age: "+age+" JohnsAge: "+johnsAge);
		
	}

}
