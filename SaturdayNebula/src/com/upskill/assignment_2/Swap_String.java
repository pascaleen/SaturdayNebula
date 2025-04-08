package com.upskill.assignment_2;

public class Swap_String {

	public static void main(String[] args) {
		
		String str1 = "Talen";
		String str2 = "Tech";
		
		System.out.println("Before Swap str1 = " + str1 + ", str2 = " + str2);
		
		String temp = str1;
		str1 = str2;
		str2 = temp;
		
		System.out.println("After Swap str1 = " + str1 + ", str2 = " + str2);
		// TODO Auto-generated method stub

	}

}
