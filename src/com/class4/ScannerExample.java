package com.class4;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter any number");
	/*nextInt(); ->for numbers
	 * nextLine();->for strings
	 * nextDouble();->double 
	 */
	int number=scan.nextInt();
	System.out.println("Entered number is "+number);
	System.out.println("__________________");
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your name");
	String name=input.nextLine();
	System.out.println("Good Afternoon "+name);
	
	
	System.out.println("Whats your name");
	
	String abb=input.nextLine();
	
	
	
	
	
	
	
	
}
}
