package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter your class day:");
	
	String day=scan.nextLine();
	
	if(day.trim().equalsIgnoreCase("Saturday")) {
		System.out.println("Saturday is your Java class");
	}else if(day.trim().toLowerCase().equals("sunday")) { //3 method in same if statement 
		System.out.println("Sunday is your GIT class");
	}else if(day.trim().toUpperCase().equals("TUESDAY")) {
		System.out.println("Tuesday is your SDLC class");
	}else if(day.trim().equalsIgnoreCase("Thursday")) {
		System.out.println("Thursday is your manuel testing class");
	}else {
		System.err.println("Invalid!! please enter a valid class day");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
