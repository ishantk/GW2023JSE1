package com.auribises.one;

public class App {

	public static void main(String[] args) {
		
		// Within the same package, we can craete object of any class in any class
		One oRef = new One();
		Two tRef = new Two();
		
		// private: which cannot be accessible outside the class
		//oRef.pvtShow();		// error
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		//tRef.pvtShow();			// error
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

	}

}
