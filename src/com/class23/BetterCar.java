package com.class23;

public class BetterCar {
	 
		static String make;
		public String model;
		public String color;
		public int speed;
		public int doors;
		
		BetterCar(String carModel,String carColor,int carSpeed,int carDoors){
			model=carModel;
			color=carColor;
			speed=carSpeed;
			doors=carDoors;
		}	
		public void getDetails() {
			System.out.println("I build "+color+" "+make+" "+model);
			System.out.println("My car has "+doors+" My car can have speed up to "+speed);
		}
	public static void main(String[] args) {
	make="BMW";
	
	//BetterCar car1=new BetterCar(); -->compiler will give an error,we have to pass values when we build a 
	                                    //those values will be passed arguments to the constructors 
	                                    //through constructor instance variables will get initilized
	BetterCar bcar1=new BetterCar("X5", "black", 4, 400);
	
	bcar1.getDetails();
		
		
		
		
		
		
	}	
}
