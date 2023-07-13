
public class Movie {
	
	String title;
	String duration;
	double rating;
	
	Actor[] starCast; // 1 to many
	
	Movie() {
	
	}

	Movie(String title, String duration, double rating, Actor[] starCast) {
		this.title = title;
		this.duration = duration;
		this.rating = rating;
		this.starCast = starCast;
	}
	
	void show() {
		System.out.println("^^^^^^MOVIE^^^^^^^");
		System.out.println(title+" | "+duration);
		System.out.println("\u2606"+rating);
		System.out.println("^^^^^^^^^^^^^^^^^^");
		
		System.out.println("STAR CAST OF "+title);
		System.out.println("TOTAL ACTORS: "+starCast.length);
		
		for(int idx=0;idx<starCast.length;idx++) {
			starCast[idx].show();
		}
	}
	
}
