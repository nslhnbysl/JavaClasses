package com.class31;

public interface Shape {

	void calculateArea(double num); 
	void calculatePerimiter(double num); 
}
class Circle implements Shape{

	@Override
	public void calculateArea(double num) {
System.out.println(3.14*(num*num));		
	}

	@Override
	public void calculatePerimiter(double num) {
		
System.out.println((3.14*2)+num);		
	}
	
}

class Square implements Shape{

	@Override
	public void calculateArea(double num) {
System.out.println(num*num);		
	}

	@Override
	public void calculatePerimiter(double num) {
System.out.println(num*4);		
	}
	
}
