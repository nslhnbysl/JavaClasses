package com.class28;

public class Car {

	 String model,make;
	Car(){
		System.out.println("this is non argument constructor from parent class");
	}
	Car(String make,String model){
		this.make=make;
		this.model=model;
	}
}
class Tesla extends Car{
	
	 boolean autopilot;
	Tesla(){
		super();//if we dont add any super there compiler already add it automatically
		System.out.println("this is non argument constructor from child class");
		}
	
	Tesla(boolean autopilot){
		this.autopilot=autopilot;
	}
	
	Tesla(String make,String model,boolean autopilot){
		//super("Tesla","S5"); if we create like this compiler gives always this specific model and make but we can fix it
		super(make,model);//we making constructor call
		
	}
	public void displayInfo() {
		System.out.println("Car "+make+" "+model+" has a autopilot mode "+autopilot);
	}
}