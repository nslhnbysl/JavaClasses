package com.class05;

import java.util.Scanner;

//to import shortcut is ctrl+shift+o
public class MoreLogicalExamples {

	public static void main(String[] args) {
/*ask user to enter daily sales 
 * based on the sales range we want to give commission to the person
 * if sales is <100 -->commission is 10%
 * if sales is between 100-200 -->commission %20
 * 
 */
		Scanner scan;
		double salesAmount;
	    double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		salesAmount=scan.nextDouble();
		
		if(salesAmount<100 && salesAmount<200) {
		//lets give user 10% commission of sale
		commission=salesAmount*0.1;
		}else if (salesAmount>=200 && salesAmount<500) {
		//lets give user 20% commission of sale
		commission=salesAmount*0.2;
		}else if (salesAmount >=500 ) {
			commission=salesAmount*0.5;
		}else {
			System.out.println("You are not eligible to take a commission");
		}
			
		System.out.println();
		
		
		
		
		
		
		
	}

}
