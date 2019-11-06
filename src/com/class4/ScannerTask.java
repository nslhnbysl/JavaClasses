package com.class4;

import java.util.Scanner;

public class ScannerTask {
public static void main(String[] args) {
	
	Scanner keyboard=new Scanner(System.in);
	
	System.out.println("What is the amount of loan you needed");
	
	int amount=keyboard.nextInt();
	
	if(amount<200000) {
		System.out.println("You would lend the money");
	}else {
		System.out.println("You would reject the client");
	}
	System.out.println("________________");
	
	System.out.println("How old are you");
	
	int age=keyboard.nextInt();
	
	if(age>=18) {
		System.out.println("You can get a driver licence");
	}else {
		System.out.println("You can get a learners permit");
	}
	
	System.out.println("_______________");
	
	System.out.println("Whats the temperature in Virginia");
	int temperature=keyboard.nextInt();
	
	System.out.println("The temperature in VA is "+ temperature+" Farenheit");
	
	int convertedTemp=(temperature-32)*5/9;
	
	System.out.println("The temperature in VA is "+ convertedTemp+" Celcious");
	
	
	
}
}
