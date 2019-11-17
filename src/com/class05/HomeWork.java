package com.class05;

import java.util.Scanner;

public class HomeWork {
public static void main(String[] args) {
	
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("Do you have a credit card?true or false");
	
	boolean cc=input.nextBoolean();
	
	if(cc) {
		
		System.out.println("What is the balance on your card?");
	    int balance=input.nextInt();
	if(balance>1000) {
		System.out.println("Please pay off your balance");
	}else {
		System.out.println("You can spend more money");
	}
	}else {
		System.out.println("Would you like to apply for credit card");
	}
	
	
	
	System.out.println("How many years did you work?");
	int years=input.nextInt();
	
	System.out.println("Please enter your annuel salary");
	int salary=input.nextInt();
	
	if (years>=5) {
		System.out.println("You are eligible for bonus");
		if (salary>50000) {
			System.out.println("Bonus=5000");
		}else {
			System.out.println("Bonus=3000");
		}}else {
		System.out.println("You are not eligible for bonus");
	}
	
	
	
	
	         
	
	
	
	
}



}
