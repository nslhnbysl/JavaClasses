package com.class05;

public class LogicalNot {
	public static void main(String[] args) {
	
	boolean b1=!true;
	boolean b2=!false;
	System.out.println(b1);
	System.out.println(b2);	
		
	boolean traffic=true;
	
	if(!traffic) {//using ! we are reverting condition
		System.out.println("On time");
	}else {
		System.out.println("Late");
	}
		
		
	boolean isRain=false;
	if(!isRain) { //if its not rain 
		System.out.println("Take an umbrella");
	}else {
		System.out.println("Do not take an umbrella");
	}
		//lets compare 2 numbers using not operator
		
	int num1=10;
	int num2=11;
	if(num1==num2) {
		System.out.println("Numbers are equal");
	}else {
		System.out.println("Numbers are not equal");
	}
	
	if(!(num1==num2)) {
		System.out.println("Numbers are not equal");
	}else {
		System.out.println("Numbers are equal");
	}
	
	//if name is NOT Marry or Anna then you are not my sister
	String name="Marry";
	String name2="Anna";
	
	if(!(name.equals("Marry") || name.equals("Anna"))) {
		
		System.out.println("You are not my sister");
	}else {
		System.out.println("You are my sister");
	}
	
	
	
	
	
}
}
