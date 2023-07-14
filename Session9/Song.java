
public class Song {
	
	String track;
	String artists;
	double duration;
	Song next;
	Song previous;
	
	Song() {
		
	}

	Song(String track, String artists, double duration) {
		this.track = track;
		this.artists = artists;
		this.duration = duration;
	}
	
	void show() {
		System.out.println("------------------------------");
		System.out.println(track+" | "+duration);
		System.out.println(artists);
		
		System.out.println("CURRENT: "+this+" NEXT: "+next+" PREVIOUS: "+previous);
		
		System.out.println("------------------------------");
	}

}
