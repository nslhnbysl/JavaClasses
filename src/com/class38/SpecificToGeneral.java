package com.class38;

public class SpecificToGeneral {

	public static void main(String[] args) {
		int num1=10; int num2=0;
		int result;
		
		try {
			result=num1/num2;
		System.out.println(result);	
		Thread.sleep(2000);
		//}catch(Exception e) {    //we must add from smallest to largest and exception type is biggest and have all other scenarios we can add after the others
			
		}catch(ArithmeticException e) {
		e.getMessage();
		}catch(InterruptedException e) {
			System.out.println(e);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	}

