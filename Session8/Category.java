
public class Category {
	
	String name;
	int numOfMovies;
	Movie[] movies; // 1 to many
	
	Category() {
	
	}

	Category(String name, int numOfMovies, Movie[] movies) {
		this.name = name;
		this.numOfMovies = numOfMovies;
		this.movies = movies;
	}
	
	void showTitle() {
		System.out.print(name+" | ");
	}
	
	void show() {
		System.out.println("~~~~~~"+name+"~~~~~~~");
		System.out.println("Total Movies: "+numOfMovies);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	}
	
	void showMovies() {
		for(int idx=0; idx<movies.length; idx++) {
			movies[idx].show();
		}
		System.out.println();
	}
}
