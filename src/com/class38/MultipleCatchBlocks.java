package com.class38;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		
		division(12,0);
		division(12,2);
		
		
		
	}
public static void division(int num1,int num2) {
	int result;
	try {
		result=num1/num2;
	System.out.println(result);	
	Thread.sleep(2000);
	}catch(ArithmeticException e) {
		System.out.println("Please do not pass 0 as a second number");
	}catch(InterruptedException e) {
		System.out.println("Someone interrupted program sleep");
	}catch(Exception e) {  //catching all types of exception because we refer parent class name
	System.out.println("Catching all types of exception");	
	}
	System.out.println("end of my method");
}
}
