package com.class31;

public class Car {
//4. Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() 
//which should be returning a price of the car.
//Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has
//its own implementation of  calculateSalePrice() method in which returned price calculated as following:
//if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
//if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
	
	public double carPrice;
	public String color;
	
	public Car(double carPrice,String color) {
		this.carPrice=carPrice;
		this.color=color;
	}

	
	public double calculateSalePrice() {
		return carPrice;
	}
}
class Truck extends Car{
	public double weight;
	public Truck(double carPrice, String color,double weight) {
		super(carPrice, color);
		this.weight=weight;
		
	}
public double calculateSalePrice() {
		double discount;
		if(weight>2000) {
		discount=(0.10*carPrice);
	carPrice=carPrice-discount;
		}else {
			discount=(0.20*carPrice);
			carPrice=carPrice-discount;
		}
	return carPrice;
	}
	
}

class Sedan extends Car{
	int length;
	public Sedan(double carPrice, String color,int length) {
		super(carPrice, color);
		this.length=length;
		}

	public double calculateSalePrice(double length) {
		double discount;
		if(length>20) {
		discount=(0.05*carPrice);
		carPrice=carPrice-discount;
		}else {
			discount=(0.10*carPrice);
			carPrice=carPrice-discount;
		}
	return carPrice;	
	}
}
