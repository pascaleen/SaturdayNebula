package com.upskill.java_4;

public abstract class AbstractClass {
	
	// Abstract class has both abstract and regular class
	
	
	public void car() {
		System.out.println("My car is Volvo");
	}
	
	public void color() {
		System.out.println("My car is Blue");
	}

     public abstract void iCar();
	
	public abstract void iWheel();
	
	public abstract int iDoor();
	
	public abstract String iSeatType();
	
	
	/* 
	 
	 (Parent)            (KeyWord)         (Child)             (Keyword)         (GrandChild)
	 *Class                extends           Class
	 *Abstract Class       extends           Class
	 *Interface(2)         implements        Class(-2)                            
	 *Interface(2)         extends           Interface(2+2)      implements         Class(-4)
	 *Interface                              Abstract Class 
	 *Interface            implement         Interface
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
