
public class Patient {
	
	String name;
	int age;
	char gender;
	Patient next;
	Patient previous;
	
	public Patient() {
	
	}

	Patient(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		//next = null;
		//previous = null;
	}
	
	void show() {
		System.out.println("--------------------------");
		System.out.println(name+" | "+age+" | "+gender);
		System.out.println("--------------------------");
		System.out.println();
	}

}
