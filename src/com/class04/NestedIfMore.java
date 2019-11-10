package com.class04;

public class NestedIfMore {

	public static void main(String[] args) {
	/*checkage,if age is less than 16-->you are too young to drive
	 * otherwise-->you are aligible to drive$ we will check 
	 * if you are older than 18 -->                                     //second blocks blongs to the else part
	 * you can get driver license and if not you can get driver permit
	 */

	int age=16;
	
	if(age<16) {
		System.out.println("You are too young");
		
	}else {
		System.out.println("You are eligible to drive");
	if(age>=18) {
		System.out.println("You can drive alone");
	}else {
		System.out.println("You need your parents to drive");
	}
	}
		System.out.println("----------------------------");	
		
		/*we need to check if student completed quiz
		 * if yes-->good job' if not-->not good
		 * if they completed we will check score
		 * if more than 90-->you got an A
		 * if more than80-->you got a B
		 * anyting below-->you should study more
		 */
		
	boolean quiz=true;
	int score=60;
	
	if (quiz) {
		System.out.println("Good Job");
	if (score>90) {
		System.out.println("You got an A");
	}else if(score>80) {
		System.out.println("You got an B");
	}else 
		System.out.println("You should study more");
	}else {
		System.out.println("Not Good");
	}
	System.out.println("______________________");
	
	boolean diploma=false;
	int gpascore=8;
	
	
	if(diploma){
		System.out.println("Congratulations");
	}else {
		System.out.println(" Get a degree");
		if(gpascore>=3.5) {
			System.out.println("You are eligible for scholarship");
		}else {
			System.out.println("You should have studied harder");}
		
	}
	System.out.println("__________________");	
	
	
	double rate=4;
	double price=500000;	
	
	if(rate>4.5) {
		System.out.println("I Will not buy a house");
	}else {
		System.out.println("I Will consider buying");
	if(price>200000) {
		System.out.println("I Will take a loan");
	}else {
			System.out.println("I Will pay cash");
		}
	}
	}
	
	
		
	
		
	}

