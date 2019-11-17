package com.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
/*ask user to enter boolean value for sale
 * if no sale -->I am not shopping
 * if sale-->check the price of the item
 * based on the amount we will have to calculate the price after discount
 * if price>20-->apply 10%discount
 * if price between 20-200-->20%
 * if price between 100-500-->30%
 * anyting-->50%
 * after dicount ___the price of the item reduce from __ to __
 */
		
//	Scanner scan=new Scanner(System.in);
//	System.out.println("Is there a sale?");
//	boolean sale=scan.nextBoolean();
//	double price=0;
//	double discount;
//	double FinalPrice;
//	
//	if (!sale) {
//		System.out.println( "I am not shopping");
//
//	}else {
//		System.out.println("How much is this?");
//	if(price<20) {
//		discount=price*0.10;
//		FinalPrice=price-discount;
//	}else if(price>=20 && price<100) {
//		discount=price*0.20;
//		FinalPrice=price-discount;
//	}else if(price>=100 && price<500) {
//		discount=price*0.30;
//		FinalPrice=price-discount;
//	}else {
//	discount=price*0.50;	
//	}
//	FinalPrice=price-discount;
//	System.out.println("After discount "+discount+ "the price of the item reduce from "+price +"to" + FinalPrice );
//	}	
//		
//	System.out.println("_________________");	
		
	/*ask user to enter the month they were born
	 * based on the month define the season 
	 * if user is born in Jan,Feb,Dec->winter
	 * if march,april,may->spring
	 * if jun,jul,aug->summer
	 * if sep,oct.nov->fall
	 * otherwise-->Unknown
	 * at the end of the program 
	 * "Yoy were born in __"	
	 */	
		
		
	System.out.println("Please enter your month born in");	
	Scanner scan = new Scanner(System.in);
	String month=scan.nextLine();
	String season;
	
	if(month.equals("january") || month.equals("February") || month.equals("December")) {
		season="Winter";
	}else if(month.equals("April") || month.equals("May") || month.equals("March")) {
		season="Spring";
	}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
		season="Summer";
	}else if(month.equals("September") || month.equals("October") ||month.equals("November")) {
		season="Fall";
	}else {
		//System.out.println("Unknown");
		season="Unknown";
	}
	System.out.println("You were born in " +season);
	
	
	
	}

}
