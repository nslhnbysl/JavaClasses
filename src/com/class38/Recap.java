package com.class38;

public class Recap {

	public static void main(String[] args) throws InterruptedException {

		//int num="1"; //-->this is not an exception this is a SYNTAX ERROR 
		
		Integer[]nums= {12,23};
		 //this is a exception we dont see any exception sign before run 
		
		try {
			System.out.println(nums[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Trying to access element outside of the boundry");
		}
		//compile time-checked 
		Thread.sleep(10000);
		System.out.println("end of the code");
	}

}
