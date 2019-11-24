package com.class17;

public class Car {
   //there is no main method
   //define attributes/features
	
   String make,model,color;
   int year,wheels,windows;
   
		
  //adding behavior/action-->methods();  all behaviors should be seperate 
   
   void drive() {
	  start();
   }
		
	void start() {
		System.out.println("Car "+make+ " can start");
	}
		
	void accelerate() {
		System.out.println("Car "+make+ " can accelerate");
	}
		
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.drive();
	}

}
