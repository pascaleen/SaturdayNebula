package com.upskill.assignment_1;

public class NumberOperation {
	
	// function that return 30
	public static int returnThirty() {
		return 30;	
	}

	
	// function that return 50
	public static int returnFifty() {
		return 60;
		
	}
	
	public static void substract() {
		
		int num1 = returnThirty();
		int num2 = returnFifty();
		int result = num2 - num1;
		System.out.println("The Substraction Results is :" + result);
		
		
		
	}
	
	public static void main(String[] args) {
		
	substract();
		// TODO Auto-generated method stub

	}

}
