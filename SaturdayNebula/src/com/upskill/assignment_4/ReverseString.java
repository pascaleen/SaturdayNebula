package com.upskill.assignment_4;

public class ReverseString {
	
	public static String reverseUsingLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append characters in reverse order
        }
        return reversed;
    }

	public static void main(String[] args) {
		
		String input = "Hello";
        System.out.println("Reversed String: " + reverseUsingLoop(input));
    }
		// TODO Auto-generated method stub

	}


