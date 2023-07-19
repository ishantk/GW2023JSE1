import java.util.Scanner;

// OOPS
// WhatsApp has many contact and with every we have chat conversation messages

//class Conversation{
//	String message;
//	int status;
//}

class Contact{
	
	String name;
	String phone;
	String[] conversations;
	
	Contact() {
	
	}

	Contact(String name, String phone, String[] conversations) {
		this.name = name;
		this.phone = phone;
		this.conversations = conversations;
	}
	
	void showContact() {
		System.out.println("name: "+name+" | phone: "+phone);
		for(String text : conversations) {
			System.out.println(text);
		}
	}
}


public class WhatsAppChatSearch {

	public static void main(String[] args) {
		
		
		String[] conv1 = {"Hi", "Hello", "This is John", "Nice to Hear From You.."};
		String[] conv2 = {"Welcome", "Thank you", "Do you teach Java", "Yes i Do.."};
		String[] conv3 = {"Thank you for your time", "Loooking forward to hear from you", "Thanks", "Bye"};
		
		Contact c1 = new Contact("John", "+91 99999 98111", conv1);
		Contact c2 = new Contact("Jackson", "+91 98765 22345", conv2);
		Contact c3 = new Contact("Fionna", "+91 62805 23121", conv3);
		
		Contact[] contacts = {c1, c2, c3};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Text to Search..");
		String text = scanner.nextLine();
		scanner.close();
		
		for(Contact contact : contacts) {
			
			if(contact.phone.startsWith(text) || contact.name.contains(text)) {
				contact.showContact();
			}
			
			/*for(String str : contact.conversations) {
				if(str.toLowerCase().contains(text.toLowerCase())) {
					contact.showContact();
					break;
				}
			}*/
		}
		

	}

}
