package com.class23;

public class TaskTest {
	//Write a program that will have a constructor: 
	//one with parameters and second without any parameters.
	//Create a separate Test class where you will execute both of the constructors.
	
	String name;
	TaskTest(){
		System.out.println("this one is without any parameters constructor");
	}

	public TaskTest(String nameValue){
		name=nameValue;
		
		System.out.println("My name is "+name);
	}
	
	//Write a java program of Class Students that takes students name and 3 subject grades.
	//Inside your class also have a method to Calculate Average Grade.
	//Test Student class for 5 different students with different marks.
	//Your program should print an average mark of each students name.
	//NOTE: please use different names for instance and local variables.
}
