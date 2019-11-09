package com.class15;

import java.util.Scanner;

public class StringManupilationsTask {

	public static void main(String[] args) {

		//lets ask user to enter browser 
		//based on the input we say "your selected browser is"_________
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter Browser name ");
		String browser=scan.nextLine();
		//switch case just check a equality -we check equality and we use logical operator in if statement 
		
		switch(browser.toLowerCase())//it works in that part we convert to lower case(input value)
		{
		case "firefox":
		System.out.println("Execution be performed on"+browser);
		break;
		case"chrome":
			System.out.println("Execution be performed on"+browser);
		break;
		case"safari":
			System.out.println("Execution be performed on"+browser);
		break;
		default:
			System.out.println("Please enter valid browser ");
		}
		
		
		
		
		
		
		
	}

}
