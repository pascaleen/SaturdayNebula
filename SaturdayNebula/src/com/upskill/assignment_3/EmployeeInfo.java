package com.upskill.assignment_3;

public class EmployeeInfo {
    String name;
    int age;
    double salary;
    String address;

    // Constructor
    EmployeeInfo(String name, int age, double salary, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    // Method to display employee details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Address: " + address);
        System.out.println("----------------------");
    }


	public static  void main(String[] args) {
		
		EmployeeInfo[] employee = new EmployeeInfo[5];
	        employee[0] = new EmployeeInfo("John Doe", 30, 50000, "123 Elm Street");
	        employee[1] = new EmployeeInfo("Jane Smith", 28, 55000, "456 Oak Avenue");
	        employee[2] = new EmployeeInfo("Michael Johnson", 35, 60000, "789 Pine Road");
	        employee[3] = new EmployeeInfo("Emily Davis", 32, 52000, "321 Birch Lane");
	        employee[4] = new EmployeeInfo("David Brown", 29, 58000, "654 Maple Drive");

	        // Displaying employee details
	        for (EmployeeInfo emp : employee) {
	            ((EmployeeInfo) emp).displayInfo();
	        }
		// TODO Auto-generated method stub

	}

}
