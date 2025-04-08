package com.upskill.java_4;

public class Constructor {
	
	int studentAge;
	String studentName;
	
	public Constructor(int age){
		
		studentAge = age;
		
	}
	
     public Constructor(int age,String name){
		studentName = name;
		studentAge = age;
		
   }
     
     
     public Constructor(String name){
 		studentName = name;
 	
 		
    }
     
     
     public static void main(String[] args) {
		
		Constructor obj = new Constructor(28);
		
		System.out.println("Age Object 1 ;" + obj.studentAge);
		
		Constructor obj2 = new Constructor(25,"Rajesh");
		
		System.out.println("Age Object 2 ;" + obj2.studentAge);
		System.out.println("Name Object 2 ;" + obj2.studentName);
		
		
		Constructor obj3 = new Constructor("Jasmine");
		System.out.println("Name Object 3 ;" + obj3.studentName);
		
		// TODO Auto-generated method stub

	}

}
