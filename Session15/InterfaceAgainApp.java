
class CA{
	void show() {
		System.out.println("show of CA");
	}
}

class CB{
	void show() {
		System.out.println("show of CB");
	}
}

// Multiple Inheritance Not Supported in Java
// No Virtual Keyword the way we have it in CPP :)
/*class CC extends CA, CB{
	
}*/

interface I1{
	void fun();
	void hi();
}

interface I2{
	void hello();
	void fun();
}

// Inheritance on Interfaces :)
// Multiple Inheritance on Interfaces...
interface I3 extends I1, I2{
	
}

//Multiple Implementation is Supported in Java
class CC implements I3{//implements I1, I2{
	
	public void fun() {
		System.out.println("this is fun");
	}
	
	public void hello() {
		System.out.println("this is hello");
	}
	
	public void hi() {
		System.out.println("this is hi");
	}
	
}

public class InterfaceAgainApp {

	public static void main(String[] args) {
		CC cc = new CC();
		cc.fun();
		cc.hello();
		
		// RTP: Interface Ref Var can refer to the object which implements it
		I1 iRef1 = new CC();
		iRef1.fun();
		//iRef1.hello(); // error :)
		
		I2 iRef2 = new CC();
		iRef2.hello();
		//iRef2.fun(); // error :)
		
		I3 iRef3 = new CC();
		iRef3.hello();
		iRef3.hi();
		iRef3.fun();

	}

}
