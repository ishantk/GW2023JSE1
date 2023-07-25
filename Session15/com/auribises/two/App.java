package com.auribises.two;

import com.auribises.one.One;
//import com.auribises.one.Two; // error

// default-> only accessible within the package
// protected-> only accessible within the package + inheritable across the package and accessible only in chile
// public -> accessible everywhere :)

// Package Level Inheritance
class Three extends One{
	
	void show() {
		//pvtShow(); // err
		//defShow(); // err
		protShow();
		//pubShow(); // OK
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();
		//oRef.pvtShow(); // error
		// oRef.defShow(); // error
		//oRef.protShow(); // error
		//oRef.pubShow(); // ok
		
		Three tRef = new Three();
		//tRef.pvtShow(); // error
		//tRef.defShow(); // error
		//tRef.protShow(); // error
		//tRef.pubShow();
		tRef.show();

	}

}
