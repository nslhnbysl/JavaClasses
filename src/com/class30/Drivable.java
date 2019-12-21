package com.class30;

public interface Drivable {

// public static final variables
	  boolean DRIVE_FAST=true; //constant variables
	public static final String NAME="Neslihan";
	
//by default compiler add -public abstract-void drive();
 void drive();	
	
// private abstract void clean();-->will give an error because we can use interfaces for just public 
 
// public final void clean(); -->will give an error because we can use interfaces with just abstract 
	
}
class Cars1{
	public void stop() {
		System.out.println("Car stops by pressing brakes");
	}
}

class Toyota extends Cars1 implements Drivable { //we use implement for interfaces between class and interface
                                                //we can achieve multiple inheritance through interface
	@Override
	public void drive() { //it must be public because access mod cannot reduce 
 System.out.println("Toyota can drive");	
 
	}
	
	
	
}