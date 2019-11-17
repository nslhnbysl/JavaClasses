package com.class08;

public class Task2 {

	public static void main(String[] args) {

	/*write a code to find the sum of even&odd numbers
	 * from range 1 to 20
	 * expecting 2 outputs;
	 * sum for odd nums=...
	 * sum for even nums=...	
	 */
		int sumEven=0;
		int sumOdd=0;
		
		for(int a=0;a<=20;a++) {
			
		if(a%2==0)	{
			
			sumEven=sumEven+a;
		}else {
			
			sumOdd=sumOdd+a;
		}
		
		
		}
		System.out.println("Sum for even numbers "+sumEven);
		System.out.println("Sum for even numbers "+sumOdd);
		
		for(int x=1;x<10;x++) {
			if(x%2==1) {
				continue;}
				System.out.println(x);
			
		}
	}

}
