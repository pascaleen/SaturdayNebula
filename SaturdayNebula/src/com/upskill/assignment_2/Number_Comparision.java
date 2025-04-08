package com.upskill.assignment_2;

public class Number_Comparision {
	
	  // Function to return the first number
    public static int getNumber1() {
        return 30; 
    }

    // Function to return the second number
    public static int getNumber2() {
        return 50; 
    }

    // Method to compare numbers and print the result
    public static void compareNumbers() {
        int num1 = getNumber1();
        int num2 = getNumber2();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

	public static void main(String[] args) {
		
		// Calling the method to compare numbers
        compareNumbers();
		// TODO Auto-generated method stub

	}

}
