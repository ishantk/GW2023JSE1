
public class ProblemStatement {

	public static void main(String[] args) {
		
		// Elections in the US
		// PartyA (democracy) | PartyB (republic)
		// state1... state5
		
		/*int partyAState1Votes = 200;
		int partyAState2Votes = 1200;
		int partyAState3Votes = 2100;
		int partyAState4Votes = 2300;
		int partyAState5Votes = 65200;
		
		int partyBState1Votes = 1200;
		int partyBState2Votes = 300;
		int partyBState3Votes = 1100;
		int partyBState4Votes = 5300;
		int partyBState5Votes = 5670;*/
		
		
		//					  0     1     2     3      4
		int[] partyAVotes = {200, 1200, 2100, 2300, 65200};
		int[] partyBVotes = {1200, 300, 1100, 5300, 5670};
		
		
		//int partyATotalVotes = partyAState1Votes + partyAState2Votes + partyAState3Votes + partyAState4Votes + partyAState5Votes;
		//int partyBTotalVotes = partyBState1Votes + partyBState2Votes + partyBState3Votes + partyBState4Votes + partyBState5Votes;
		
		int partyATotalVotes = 0;
		int partyBTotalVotes = 0;
		
		
		for(int idx=0;idx<5;idx++) {
			partyATotalVotes = partyATotalVotes + partyAVotes[idx];
			partyBTotalVotes = partyBTotalVotes + partyBVotes[idx];
		}
		
		System.out.println("partyATotalVotes: "+partyATotalVotes);
		System.out.println("partyBTotalVotes: "+partyBTotalVotes);
		
		if(partyATotalVotes > partyBTotalVotes) {
			System.out.println("PARTY A WINS by "+(partyATotalVotes - partyBTotalVotes)+" Votes");
		}else {
			System.out.println("PARTY B WINS by "+(partyBTotalVotes - partyATotalVotes)+" Votes");
		}

	}

}
