package com.class37;

public class ExceptionDemo {

	public static void main(String[] args) {

		division2Integers(20,10);
		division2Integers(20,0);
		division2Integers(50,5);
		division2Integers(100,0); //even had a exception this execution will contunie through try catch code 
		
		
		
		
	}
public static void division2Integers(int num1,int num2) {
	try {
		System.out.println(num1/num2); //if there is no issue this code also will execute
	}catch(ArithmeticException e) {    //if there is happen an exception we catch through this way and throw it
		System.out.println("Cannot devide by zero,please provide valid number");
		System.out.println(e.getMessage());
	}
}
}
