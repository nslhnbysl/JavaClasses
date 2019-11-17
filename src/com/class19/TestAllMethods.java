package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
     
		
		//find the largest number between 300 and 500
		//then identify is the largest number is odd or even 
		Allmethods obj=new Allmethods();
		int large=obj.findLargest(300, 500);
		//System.out.println(large);
		boolean isOdd=obj.isOdd(large);
		System.out.println(isOdd);
		
		//Task-Call method weekDayName 
		//if (tuesday,wednesday,thursday,saturday,sunday)
		//I am learning Java
		String day=obj.weekDayName(5);
		if(day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("wednesday") ||day.equalsIgnoreCase("Thursday") ||day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) {
			System.out.println("I am learning JAVA");
		}else {
			System.out.println("I am study at home");
		}
	}

}
