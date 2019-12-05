package com.class27;

public class Car{
	String make,model;
	int year;
	
	
	Car(){
		System.out.println("I am non argument constructor");
	}
	
	public void display() {
		System.out.println("We build "+year+" "+make+" "+model);
	}

	public static void main(String[] args) {
		
		Car car=new Car();
		car.display();
		
		//int num;
		//System.out.println(num);Ce=local variables must be initialized
		
		Tesla tesla=new Tesla();//whenever you created obj of child class first parent class constructor is print and then 
		
			
		
	}
}
class Tesla extends Car{
	boolean autoPilot;
	
	Tesla(){
		//compiler automaticly call the parent class constructor
		super(); //compiler add this default
		System.out.println("Non argument constructor of the child class");
	}
	
}