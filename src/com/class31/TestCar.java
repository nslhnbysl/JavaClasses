package com.class31;

public class TestCar {

	public static void main(String[] args) {

		Car car=new Car(2000,"blue");
		System.out.println(car.calculateSalePrice());
		
		Sedan sedan=new Sedan(2000,"pink",30);
         System.out.println(sedan.calculateSalePrice());
         
         Truck truck=new Truck(2000,"grey",3000);
         System.out.println(truck.calculateSalePrice());
	
	
	
	
	}

}
