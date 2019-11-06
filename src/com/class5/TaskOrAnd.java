package com.class5;

import java.util.Scanner;

public class TaskOrAnd {
public static void main(String[] args) {
	
int day=6;

if(day>=1 && day<=5) {
	System.out.println("It is a weekday");
}else if(day==6 || day==7) {
		
	System.out.println("It is a weekend");
}else {
	System.out.println("Invalid day");
}
	
	Scanner keyboard=new Scanner(System.in);
	
	System.out.println("Please enter your heights");
	double feet=keyboard.nextDouble();
	
	if (feet<5) {
		System.out.println("You are short");
	}else if (feet>5 && feet<6) {
		System.out.println("You are medium");
	}else if(feet>6) {
		System.out.println("You are tall");
	}
	
	
	
	
	
}
}
