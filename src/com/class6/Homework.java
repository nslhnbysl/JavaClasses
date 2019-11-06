package com.class6;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a number");
	double A,B,C;
	double max;
	A=scan.nextDouble();
	B=scan.nextDouble();
	C=scan.nextDouble();
	
	if(A>B && A>C) {
		max=A;
	}else if (B>A && B>C) {
		max=B;
	}else {
		max=C;
	}
	System.out.println("Maximum number is "+max);
		
	
			
	System.out.println("Enter your grade");	
	char grade=scan.next().charAt(0);
	String comment;
	
	switch(grade) {
	case 'A':
	comment="Excellent";
	break;
	case 'B':
	comment="Good";
	break;
	case 'C':
	comment="Average";
	break;
	case 'D':
	comment="Bad";
	break;
	default:
		comment="Not exceptable";
	
	
	System.out.println("Your grade is "+comment);
	
	
	}
		System.out.println("__________________");
	boolean isRain=scan.nextBoolean();
	String classMode; 
	if(!isRain) {
		classMode="In class";
	}else {
		classMode="Online";
	}
		
	System.out.println(classMode);	
		
	
		
		
		
		
		
	}

}
