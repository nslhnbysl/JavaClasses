package com.class08;

import java.util.Scanner;

public class BreakAndContinueTask {

	public static void main(String[] args) {

		
		for(int i=1;i<=50;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	Scanner scan=new Scanner(System.in);
	
	String answer;
	
	for(int i=1;i<=10;i++) {
		System.out.println("Would you like to apply for credit card");
		 answer=scan.nextLine();
		if(answer.equals("yes")) // (answer.equalsIgnoreCase("yes")){
		{
			break;
			
		}
		
		
	}
		
		
		
		
	}

}
