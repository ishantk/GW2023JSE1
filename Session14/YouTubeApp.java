
abstract class Notification{
	abstract void notify(String message);
}

// RTP: Ref Var of Parent can refer to the Child Object
class User extends Notification{
	String name;
	String email;
	
	void notify(String message) {
		System.out.println("Hello, "+name);
		System.out.println("A new Notification Received...");
		System.out.println("Notification: "+message);
	}
}

class YouTubeChannel{
	
	String name;
	int numberOfSubscribers;
	
	Notification notification;
	
	YouTubeChannel(){
		name = "auribises";
		numberOfSubscribers = 0;
	}
	
	void subscibe(Notification noti) {
		notification = noti;
	}
	
	void uploadVideo(String videoTitle) {
		notification.notify("A new Video has been uploaded.."+videoTitle);
	}
	
}

public class YouTubeApp {

	public static void main(String[] args) {
		
		YouTubeChannel channel = new YouTubeChannel();
		
		User user1 = new User();
		user1.name  = "John";
		user1.email = "john@example.com";
		
		channel.subscibe(user1);
		
		channel.uploadVideo("Learn Java with Ishant");
		
//		User user2 = new User();
//		user2.name  = "Fionna";
//		user2.email = "fionna@example.com";

	}

}
