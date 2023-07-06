import java.util.Arrays;

public class ReferenceCopyPart2 {

	public static void main(String[] args) {
		
		int[] scores = {12, 30, 45, 66, 70, 90, 100, 12, 15, 68};
		int[] rollNumbers = {1, 2, 3, 4, 5};
		
		System.out.println("scores is: "+scores);
		System.out.println("rollNumbers is: "+rollNumbers);
		
		// REFERENCE COPY OPERATION
		int[] teamScores = scores;
		
		// Reference OverWrite to a new HashCode
		teamScores = rollNumbers;
		
		teamScores[1] = 99;
		
		System.out.println("teamScores is: "+teamScores);
		
		System.out.println("scores: "+Arrays.toString(scores));
		System.out.println("rollNumbers: "+Arrays.toString(rollNumbers));
		
	
	}

}
