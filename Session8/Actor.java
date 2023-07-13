
public class Actor {
	
	String name;
	int age;
	char gender;
	int experience;
	
	Actor() {
	
	}

	Actor(String name, int age, char gender, int experience) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.experience = experience;
	}
	
	void show() {
		System.out.println("******Actor******");
		System.out.println(name+" "+age);
		System.out.println(gender+" "+experience);
		System.out.println("*****************");
	}
	
}
