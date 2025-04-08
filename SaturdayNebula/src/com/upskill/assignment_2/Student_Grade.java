package com.upskill.assignment_2;

public class Student_Grade {
	
	
	public static void calcluateGrade(int marks) {
		if (marks >=90) {
			System.out.println("Grade A");
		} else if (marks >=80) {
			System.out.println("Grade B");
		} else if (marks >=70) {
			System.out.println("Grade C");
		} else if (marks >=60) {
			System.out.println("Grade D");
		} else {
			System.out.println("Fail");
			
		}
	}

	public static void main(String[] args) {
		
		 calcluateGrade(95); // Should print Grade A
	     calcluateGrade(85); // Should print Grade B
	     calcluateGrade(75); // Should print Grade C
	     calcluateGrade(65); // Should print Grade D
	     calcluateGrade(50); // Should print FAIL
		
 
		// TODO Auto-generated method stub

	}

}
