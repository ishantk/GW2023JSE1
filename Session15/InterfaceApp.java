/*abstract class Cab{
	
	Cab(){
		System.out.println("Cab Object Constructed..");
	}
	
	abstract void bookCab(String from, String to);
}*/

interface Cab{
	
	//public abstract void bookCab(String from, String to);
	void bookCab(String from, String to);
}

class MiniCab implements Cab{//extends Cab{
	
	MiniCab(){
		System.out.println("MiniCab Object Constructed..");
	}
	
	public void bookCab(String from, String to) {
		System.out.println("Mini Cab Booked from "+from+" to "+to);
	}
}

class SedanCab implements Cab{//{extends Cab{
	
	SedanCab(){
		System.out.println("SedanCab Object Constructed..");
	}
	
	public void bookCab(String from, String to) {
		System.out.println("Sedan Cab Booked from "+from+" to "+to);
	}
}

public class InterfaceApp {

	public static void main(String[] args) {

		Cab cab;
		
		//cab = new MiniCab();
		cab = new SedanCab();
		cab.bookCab("Work", "Home");

	}

}
