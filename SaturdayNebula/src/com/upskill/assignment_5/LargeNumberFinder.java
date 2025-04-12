package com.upskill.assignment_5;

import java.util.List;
import java.util.Arrays;

public class LargeNumberFinder {
	
	 public static int findLargest(List<Integer> numbers) {
	        int max = numbers.get(0); // Assume first number is the largest

	        for (int num : numbers) {
	            if (num > max) {
	                max = num; // Update max if a larger number is found
	            }
	        }
	        return max;
	    }

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 25, 8, 97, 56, 42);
        System.out.println("Largest Number: " + findLargest(numbers));
		// TODO Auto-generated method stub

     // git hub   
        
	}

}
