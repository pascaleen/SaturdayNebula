package com.upskill.java_6;

public class Exception_TryCatcheFinale {
	
	//Java Exceptions - Use try - catch -Finally
	// Built in exceptions - built in exceptions by java explain certain error situation
	//Arithmetic Exception - Occur happen in an arithmetic operation
	//class not found exception - try to access a class whose definition is not found
	//file not found exception - file is not found or does not open
	//IO exceptions -out put operation failed or interrupted
	//Interrupt exception - thread is sleeping, waiting or doing some procession
	//No such filed exception - class does not contain the field or variable specified
	//No such method exception - accessing a method which is not found
	//Null pointer exception - referring to the member of a null object
	//Number format exception - a method could not convert a string into a numeric format
	// Run time exception - any exception which occur during run time
	// String Index out of bounds exception - string class method to indicate that an index is either negative or greater
	
	// user define exception - user can also create exception where the error situation is not covered by java
	

	public static void main(String[] args) {
		
	try {	
		int[]ageNebula = new int[] {24, 25 ,28,30, 32};
		System.out.println(ageNebula[2]);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {	
		int num = Integer.parseInt("Test");
		System.out.println(num);
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	
	try {	
		throw new myException("Test");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	finally {
		System.out.println("Test Excution Complete");
	}
		// TODO Auto-generated method stub

	}

}
