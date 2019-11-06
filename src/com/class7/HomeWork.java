package com.class7;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		// TASK 2 find the largest number using nested if
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers for Nested If Task");
		
		double no1 = scan.nextDouble();
		double no2 = scan.nextDouble();
		double no3 = scan.nextDouble();
		//TRUE  OR  TRUE
	if(no1!=no2 || no2!=no3) {
		if (no1 > no2) {
					if (no1 > no3) {//no1>no2 && no1>no3
						System.out.println("Largest number is first - " + no1);
					} else {//no1>no2 but no1<no3
						System.out.println("Largest number is third - " + no3);
					}
		} else {//assuming no2>no1
					if (no2 > no3) {//no2>num1 && no2>no3 --> no2 =largest
						System.out.println("Largest number is second - " + no2);
					} else {//no2>no1 but no2<no3
						System.out.println("Largest number is third - " + no3);
					}
		}
	}else {
		System.out.println("Numbers are equal");
	}
	System.out.println("________________");
	
	int num1,num2,total=0;
	
	System.out.println("Please enter num1");
	num1 =scan.nextInt();
	char op=scan.next().charAt(0);
	System.out.println("Please enter num2");
	num2=scan.nextInt();
	
	
	switch(op) {
	case'*':
		total=num1*num2;
		break;
	case'+':
		total=num1+num2;
		break;
	case'-':
	    total=num1-num2;
	    break;
	case'/':
		total=num1/num2;
		break;
	default:
		System.out.println("Wrong operator");
	    

		
	}
	
		System.out.println(total);        //ASK?
	
	
	
	
	
	
	
	
	
	}
}