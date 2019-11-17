package com.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {

		/*
		 * ask user to enter their gender F OR M based on the input provide if
		 * F-->Female if M-->Male otherwise-->unknown
		 */

//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Please enter your gender: F or M ");
//		char gender = scan.next().charAt(0);
//		String userGender;
//
//		switch (gender) {
//		case 'F':
//			userGender = "Female";
//			break;
//		default:
//			userGender = "Unknown";
//		}
//
//		System.out.println("Your gender is " + userGender);
//
//		System.out.println("_______________");

		System.out.println("Please enter your country");
		Scanner scan=new Scanner(System.in);
		String country = scan.nextLine();
		String language=null; 

		switch (country) {
		case "Turkey":
			language = "Turkish";
			break;
		case "US":
			language = "English";
			break;
		case "France":
			language = "French";
			break;
		case "Italy":
			language = "Italian";
			break;

		}
		System.out.println("You are from " + country + " and you are speak " + language);
	}

}
