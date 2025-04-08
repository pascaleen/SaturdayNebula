package com.upskill.assignment_5;

public class FizzBuzz {
	
	  public static String getFizzBuzz(int num) {
	        if (num % 3 == 0 && num % 5 == 0) {
	            return "FizzBuzz"; // Multiple of both 3 and 5
	        } else if (num % 3 == 0) {
	            return "Fizz"; // Multiple of 3
	        } else if (num % 5 == 0) {
	            return "Buzz"; // Multiple of 5
	        } else {
	            return String.valueOf(num); // Not a multiple of 3 or 5
	        }
	    }
    

	public static void main(String[] args) {
		
		for (int i = 1; i <= 20; i++) { // Example range 1 to 20
            System.out.println(i + ": " + getFizzBuzz(i));
            
		// TODO Auto-generated method stub

	   }
  }
}


