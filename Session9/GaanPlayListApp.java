
public class GaanPlayListApp {

	public static void main(String[] args) {
		
		Song song1 = new Song("1. Udd Jaa Kaale Kaava", "Udit Narayan, Alka Yagnik", 4.48);
		
		PlayList playList = new PlayList();
		playList.add(song1);
		
		Song song2 = new Song("2. Gustakhiyan", "Gurnam Bhullar", 3.39);
		playList.add(song2);
		
		Song song3 = new Song("3. Desperado", "Raghav, Tesher", 4.07);
		playList.add(song3);

		playList.add(new Song("4. Chorni", "DIVINE, Sidhu Moose Wala", 3.01));
		playList.add(new Song("5. Kasol", "Mani Longia, Starboy X", 2.40));
		
		System.out.println("ITERATE FORWARD");
		playList.iterate(true);
		
		System.out.println("ITERATE BACKWARD");
		playList.iterate(false);
		
	}

}
