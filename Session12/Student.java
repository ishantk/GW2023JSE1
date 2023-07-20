
public class Student {
	
	// default or non private
	private int roll;
	private String name;
	private int age;
	
	// default or non private
	Student(){
		
	}
	
	Student(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	
	
	
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		
		// VALIDATION :)
		if(roll > 0) {
			this.roll = roll;
		}else {
			System.err.println("Roll Number cannot be Negative");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length() != 0) {
			this.name = name;
		}else {
			System.err.println("Name cannot be Empty");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}else {
			System.err.println("Age cannot be Negative");
		}
	}

	void show() {
		System.out.println("Roll: "+roll+" Name: "+name+" Age: "+age);
	}
	
}
