package com.class17;

public class ObjectsOfCarClass {

	public static void main(String[] args) {

	//to create an object syntax is
	//ClassName variable=new ClassName();
	//Scanner scan=new Scanner(System.in);
	//String str=new String();
		
	Car car1=new Car(); //new keyboard create an new objects
		
	car1.make="Tesla";
	car1.model="S3";
	car1.color="Black";
	car1.year=2020;
	car1.wheels=4;
	car1.windows=4;
	
	//accesing behavior using for 1 object
	car1.drive();
	car1.start();
	car1.accelerate();
	
	Car car2=new Car();
	
	car2.make="BMW";
	car2.model="i8";
	car2.color="Purple";
	car2.year=2019;
	car2.wheels=4;
	car2.windows=5;
	car2.make="Toyota";
	
	//accesing behavior using for 2 object 
	car2.start(); //its gonna print syso part in the Car class part
	car2.drive();
	car2.accelerate();
	
	//I have black Tesla
	
	System.out.println("I have "+car1.color+" "+car1.make);
	
	//I have BMW 2019

	System.out.println("I have "+car2.make+" "+car2.year);
		
		
	}

}
