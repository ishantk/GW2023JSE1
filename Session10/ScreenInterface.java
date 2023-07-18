
public class ScreenInterface {
	
	String title;
	ScreenInterface next;
	ScreenInterface previous;
	
	ScreenInterface(){
		
	}

	ScreenInterface(String title) {
		this.title = title;
//		next = null;
//		previous = null;
	}
	
	void show() {
		System.out.println(">> "+title);
	}
	

}
