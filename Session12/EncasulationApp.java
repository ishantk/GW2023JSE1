// Encapsulation: Hiding the Data
//				  by marking either attributes or methods as private
//				  Hence, you need to implement getters and setters

public class EncasulationApp {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		//s1.roll = -99;
		//s1.name = "George";
		//s1.age = 17;
		
		s1.setRoll(101);
		s1.setAge(22);
		s1.setName("Harry");

		System.out.println("Name is: "+s1.getName());
		
		s1.show();

	}

}
