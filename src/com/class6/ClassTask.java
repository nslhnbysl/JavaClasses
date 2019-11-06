package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {

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
		
 Scanner keyboard=new Scanner(System.in);
 System.out.println("Please enter your month born in");	
 String month=keyboard.nextLine();
	String season=null;
	if (month.equals("January") || month.equals("February") || month.equals("December")) {
		season="Winter";
	}else if(month.equals("April") || month.equals("May") || month.equals("March")) {
		season="Spring";
	}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
	  season="Summer";
	}else if(month.equals("September") || month.equals("October") || month.equals("December")) {
	  season="Fall";
	}else {
		System.out.println("Unknown");
		//season="Unknown";
	}
	System.out.println("You were born in " +season);
	    	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
