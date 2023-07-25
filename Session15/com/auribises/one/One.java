package com.auribises.one;

public class One {

	private void pvtShow() {
		System.out.println("[One] This is private show");
	}
	
	void defShow() {
		System.out.println("[One] This is default show");
	}
	
	protected void protShow() {
		System.out.println("[One] This is protected show");
	}
	
	public void pubShow() {
		System.out.println("[One] This is public show");
	}
	
}

// One Source file will have only 1 public class
/*
public class Two{
	
}
*/

// Default Class :)
class Two{
	
	private void pvtShow() {
		System.out.println("[Two] This is private show");
	}
	
	void defShow() {
		System.out.println("[Two] This is default show");
	}
	
	protected void protShow() {
		System.out.println("[Two] This is protected show");
	}
	
	public void pubShow() {
		System.out.println("[Two] This is public show");
	}
	
}


// class cannot be private
/*private class Three{
	
}*/

//class cannot be protected
/*
protected class Three{
	
}
*/