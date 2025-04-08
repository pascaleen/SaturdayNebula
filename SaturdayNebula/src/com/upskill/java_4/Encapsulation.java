package com.upskill.java_4;

public class Encapsulation {
	
	String name = "Upskill";
	int ssn = 512547;
	String username = "passpeiris";
	
	//setter method - name                            //write & read
	public void setName(String value) {
		name = value;	
	}
	
	//Getting method - name                            //write & read
		public String getName() {
			return name;	
		}

	public void setssn(int Value) {
		ssn = Value;
	}	
	
	public String getUserName() {
		return username;	
	}
		
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.setName("Akain");
		obj.setssn(512547);
		
		System.out.println(obj.getName());
		System.out.println(obj.getUserName());
		
		
		
		
		// TODO Auto-generated method stub

	}

}
