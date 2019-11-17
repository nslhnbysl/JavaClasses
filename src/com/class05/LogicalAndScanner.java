package com.class05;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {

	/*ask user to enter age
	 * if age is from 0 to 3 -->you are baby
	 * if age from 3-5 -->you are a toddler
	 * if age from 5-12-->you are a kid
	 * if age from 12-19-->teenager
	 * if age>20-->you are an adult
	 */
	Scanner keyboard;	
	keyboard=new Scanner(System.in)	;
	System.out.println("Please enter your age");
	int age=keyboard.nextInt();	
	String human;
	human=keyboard.nextLine();
	if(age>=0 && age<=3)	{
		//System.out.println("You are a baby");
		human="baby";
	}else if(age>3 && age<=5) {
		//System.out.println("You are a toddler");
		human="toddler";
	}else if(age>5 && age<=12) {
		//System.out.println("You are a kid");
		human="kid";
	}else if(age>12 && age<=19) {
		//System.out.println("You are a teenager");
		human="teenager";
	}else if(age>=20) {
		//System.out.println("You are an adult");
		human="adult";
	}else {
		System.out.println("Invalid age entered");
	}
		
		
		System.out.println("You are "+human);
		
		
		
		
		
		
		
		
		
		
		
	}

}
