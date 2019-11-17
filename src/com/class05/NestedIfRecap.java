package com.class05;

public class NestedIfRecap {
	
	public static void main(String[] args) {
	/*Verify if button is displayed on the page
	 * If button is displayed then we need to verify text on
	 * if text equal to sign in-->Test case pass
	 * other wise-->wrong text is displayed
	 */

	
boolean isDisplayed=true;

String buttonText="Sign in";

if(isDisplayed) {
	System.out.println("Button is displayed");
	if(buttonText.contentEquals("Sign In")) {
		System.out.println("Test case pass");
	}else {
		System.out.println("Wrong text displayed");
	}
}else {
	System.out.println("Button is not displayed");
}
	
	
	
	
	
	
	
	
}
}
