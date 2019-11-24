package com.class23;

public class CarTest {

	public static void main(String[] args) {

		Car.make="Toyota";
		
		Car car1=new Car();
		car1.model="camry";
		car1.color="pink";
		car1.speed=200;
		car1.doors=4;
		car1.getDetails();
		
		Car car2=new Car();
		car2.model="corolla";
		car2.color="blue";
		car2.speed=150;
		car2.doors=2;
		car2.getDetails();
		
	    Car car3=new Car();
	    
	    car3.model="prius";
	    car3.color="green";
    	car3.getDetails();//when we print inside this method last code value will be default value 
	
	
	BetterCar betterCar1=
	new BetterCar("camry", "white", 200, 4);//esasiest way to give a value all instance variables 
	
	betterCar1.getDetails();
			
	}

}
