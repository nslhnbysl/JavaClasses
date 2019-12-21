package com.class30;


	public abstract class Vehicle {
		//inside our abstract class we can have instance variables and methods 
		String vinNumber; //we need constructors for initialize these variables because we cannot create an obj directly for vehicle 
		
		static int totalVehicles;               //we can have static variables inside abstract class
		public static void displayTotal() {     //and we can have static methods inside abstract class
			                                    //but we cannot create abstract method with static because it is not overriding
			System.out.println("Total vehicles we build="+totalVehicles);
		}
		
		Vehicle(String vinNumber){
			this.vinNumber=vinNumber;
			totalVehicles++;
			System.out.println("Vehicle class constructor");
		}
		
		
		
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
		
	   String carType;
		Car(String vinNumber,String carType){ //we must initiliaze this because inherited class have this and we can add my own features
			super(vinNumber);
			this.carType=carType;
			System.out.println("Car class constructor");
		}
		
		
		
		
		
		public void speed() {
			System.out.println("Max car speed up to 400");
		}
		
		public abstract void breaking();
		
	}
	class BMW extends Car{ //we must extends Car because we have also have Car class unimplementation methods and 
		                   //if we extends the car class we can provide all unimplemented methods because car class also have vehicle methods 
		
        String make,model;
		BMW(String vinNumber,String carType,String make,String model){//we just add own features here not inside the super ,
			super(vinNumber,carType);
			//here we just call parent class constructor,super must be same parameters with parent class constructor and super must before this
			this.make=make;
			this.model=model;
			System.out.println("BMW class constructor");
			
		}
		@Override
		public void breaking() {
			System.out.println("BMW can break");
			
		}

		@Override
		public void start() {
	System.out.println("BMW starts remote");	}	
		
		
		 public void display() {
		        System.out.println("We build "+make+" "+model
		                +" with vin# "+vinNumber);
		    }
		
	}

