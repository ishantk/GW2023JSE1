import java.util.Scanner;

public class NetflixApp {

	public static void main(String[] args) {
		
		Actor[] starCast1 = {
			new Actor("Amir Khan", 55, 'M', 35),
			new Actor("Akshay Kumar", 50, 'M', 28),
			new Actor("Madhuri Dixit", 45, 'F', 32),
		};
		
		Actor[] starCast2 = {
				new Actor("Salman Khan", 55, 'M', 31),
				new Actor("Hritikh Roshan", 40, 'M', 18),
		};
		
		Movie[] bollywoodMovies = {
				new Movie("Dil", "2hr 20mins", 4.3, starCast1),
				new Movie("Hum Apke Hain Kaun", "3hr 10mins", 4.7, starCast2),
				
		};
		
		Movie[] hollywoodMovies = {
				//new Movie("Dil", "2hr 20mins", 4.3, starCast1),
				new Movie("Hum Apke Hain Kaun", "3hr 10mins", 4.7, starCast2),
				
		};
		
		Movie[] tollywoodMovies = {
				new Movie("Dil", "2hr 20mins", 4.3, starCast1),
				//new Movie("Hum Apke Hain Kaun", "3hr 10mins", 4.7, starCast2),
				
		};
		
		Category[] categories = {
				new Category("Bollywood", 3, bollywoodMovies),
				new Category("Hollywood", 3, hollywoodMovies),
				new Category("Tollywood", 3, tollywoodMovies),
		};
		
		System.out.println("WELCOME TO NETFLIX");
		for(int idx=0; idx<categories.length; idx++) {
			categories[idx].showTitle();
		}
		
		System.out.println();
		System.out.println("1: Bollywood, 2: Hollywood, 3: Tollywood");
		System.out.println("Enter Your Choice: ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if(choice <=3) {
			categories[choice-1].showMovies();
		}
		
		
	}

}
