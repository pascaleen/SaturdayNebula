package com.upskill.assignment_4;

public class User {
	
	private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;

    // Constructor
    public User(String username, String password, String email, String firstName, String lastName) {
        this.username = username;
        this.password = password; // Ideally, passwords should be encrypted, but for simplicity, it's stored as plain text
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter and Setter Methods
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Display user information (excluding password for security)
    public void displayUserInfo() {
        System.out.println("User Information:");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }

   
	public static void main(String[] args) {
		// Creating a User object
        User user = new User("john_doe", "securePass123", "john.doe@example.com", "John", "Doe");

        // Displaying user information
        user.displayUserInfo();
		
		// TODO Auto-generated method stub

	}

}
