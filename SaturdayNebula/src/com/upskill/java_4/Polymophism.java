package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymophism extends MethodType{

	public static void main(String[] args) {
		car("Red");
		
		Polymophism obj = new Polymophism();
		obj.annualIncomeVoid();
		// TODO Auto-generated method stub

	}
	
	public void annualIncomeVoid() {
		int calculateAnnualIncome = hourlyIncome * 2000;
		int bonus = 10000;
		int profitSharing = 37000;
		int sideHussel = 10000;
		int rental = 3000;
		int totalIncome = calculateAnnualIncome + bonus + profitSharing + rental + sideHussel;
		System.out.println("My Annual Income = " + totalIncome);
	}
	
	public static void car() {
		System.out.println("My Car is Volvo !");
	}

	
	public static void car(int door) {
		System.out.println("My Car is Volvo !, it has door : " + door);
	}
	
	public static void car(String color) {
		System.out.println("My Car is Volvo !, color of the car is : " + color);
	}
}
