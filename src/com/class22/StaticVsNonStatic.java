package com.class22;

public class StaticVsNonStatic {

	//create template for a students(school,name,grade)
	String name;
	String lastName;
	static String school="Syntax";
	char grade;
	
	//instance method,non static
	void getInfo() {
		System.out.println("My name is "+name+" I am attending "+school+" and my grade is "+grade);
		
	}
	//static method
	
	static void getInfo1() {
		System.out.println("I am attending classes at "+school);
		//System.out.println("My name is "+name);
		//compiler will give an error
		//you cannot access NON static members within Static methods
	}
	public static void main(String[] args) {
		
//accessing static members within same class 
//just use name for a variable
//or call method by its name only
		System.out.println(school);
		getInfo1();
		
		
	}
}
