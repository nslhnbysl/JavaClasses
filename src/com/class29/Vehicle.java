package com.class29;

public abstract class Vehicle {
	
	public void drive() {
		System.out.println("Vehicle can drive");
	}

	public void stop() {
		System.out.println("Vehicle can stop");
	}
	public abstract void start(); 
	public abstract void speed();

}
abstract class Car extends Vehicle{ //we can add abstract to prevent the error
	//we can skip to implementation to unimplement methods
	//we cannot create an object for to skip any implementation because its not completed 
	//it will be contunie until you provide all implementation
	
	public void speed() {
		System.out.println("Max car speed up to 400");
	}
	
	public abstract void breaking();
	
}
class BMW extends Car{ //we must extends Car because we have also have Car class unimplementation methods and 
	                   //if we extends the car class we can provide all unimplemented methods because car class also have vehicle methods 
	

	@Override
	public void breaking() {
		System.out.println("BMW can break");
		
	}

	@Override
	public void start() {
System.out.println("BMW starts remote");		
	}
	
}