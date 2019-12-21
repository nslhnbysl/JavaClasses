package com.class31;

public class Registration {

	// Create Registration Class in which you would have variables as email,
	// userName and password
	// that have an access scope only within its own class.After creating an object
	// of the class user should be able to
	// call methods and in each method separately pass values to set users email,
	// username and password.
	// Requirements:
	// Valid email consider to be only gmail
	// Valid userName and password cannot be empty and should be of length larger
	// than 6 characters.
	// Also valid password cannot contain userName.

	private String eMail;
	private String userName;
	private String password;

	// getting email
	public String giveEmail() {
		return eMail;
	}

	public String userName() {
		return userName;
	}

	public String password() {
		return password;
	}

	// setting email
	public void getEmail(String eMail) {
		if (eMail.contains("gmail")) {
			this.eMail = eMail;

		} else {
			System.out.println("Invalid e-mail type is must be gmail");
		}
	}

	public void getUserName(String userName) {
		if(!userName.isEmpty()) {
			if(userName.length()>6) {
			this.userName=userName;
		}else {
		System.out.println("User name should have more than 6 characters");
		}}else {
		System.out.println("Username cannot be empty");
	}
	
	}

	public void getPassword(String password) {
		if (!password.isEmpty()) {
			if(password.contains(userName)) {
				if(password.length()>6){
					this.password=password;
				}else {
					System.out.println("Password should have more than 6 characters");
				}}else {
					System.out.println("Password cannot contains username");
				}}else {
			System.out.println("Password should have more than ");
		}
			
	}
}
